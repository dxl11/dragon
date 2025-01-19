package com.dxl.mg.NioTest;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.util.Iterator;
import java.util.Set;

public class NioSelectorExample {
    public static void main(String[] args) throws IOException {
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        serverSocketChannel.configureBlocking(false);
        serverSocketChannel.socket().bind(new InetSocketAddress(8080));

        Selector selector = Selector.open();
        //将通道注册到选择器上，并监听事件
        serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);

        while (true){
            int readyChannels = selector.select();

            if (readyChannels==0){
                continue;
            }

            Set<SelectionKey> selectionKeys = selector.selectedKeys();

            Iterator<SelectionKey> keyIterator = selectionKeys.iterator();
            while(keyIterator.hasNext()){
                SelectionKey key = keyIterator.next();
                if (key.isAcceptable()){
                    ServerSocketChannel server = (ServerSocketChannel)key.channel();
                    SocketChannel client = server.accept();
                    client.configureBlocking(false);

                    //将客户通道注册到Selector并监听OP_READ事件
                    client.register(selector,SelectionKey.OP_READ);
                }else if (key.isReadable()){
                    //处理读事件
                    SocketChannel client = (SocketChannel)key.channel();
                    ByteBuffer buffer = ByteBuffer.allocate(1024);
                    int bytesRead = client.read(buffer);
                    if (bytesRead>0){
                        buffer.flip();
                        System.out.println("收到数据："+new String(buffer.array(),0,bytesRead));
                        //将客户端通道注册到Select并监听读事件
                        client.register(selector,SelectionKey.OP_WRITE);
                    }
                }else if (key.isWritable()){
                    SocketChannel client = (SocketChannel)key.channel();
                    ByteBuffer wrap = ByteBuffer.wrap("dddd".getBytes());
                    client.write(wrap);
                    client.register(selector,SelectionKey.OP_READ);
                }
                keyIterator.remove();
            }
        }
    }
}
