package com.dragon.designpatternsstudy.CompositePattern;

/**
 * @author Administrator
 */
public class TextFile extends File {

    public TextFile(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("这是文本文件，文件名：" + super.name);
    }
}
