package com.dragon.designpatternsstudy.CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class Folder extends File {
    private List<File> files;

    public Folder(String name) {
        super(name);
        files = new ArrayList<File>();
    }

    /**
     * 浏览文件中的文件
     */
    @Override
    public void display() {
        for (File file : files) {
            file.display();
        }
    }

    /**
     * 向文件夹中添加文件
     * @param file
     */
    public void add(File file) {
        files.add(file);
    }

    /**
     * 从文件中删除文件
     */
    public void remove(File file) {
        files.remove(file);
    }
}
