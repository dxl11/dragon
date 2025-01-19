package com.dxl.mg.NioTest;

public class SingleTon {

    private static SingleTon singleTon;

    private SingleTon() {
    }

    public static SingleTon getSingleTon() {
        if (singleTon == null) {
            singleTon = new SingleTon();
        }
        return singleTon;
    }

}
