package com.dxl.mg.ES;

import java.util.HashMap;

public class CommonMap<K, V> extends HashMap<K, V> {

    public CommonMap putData(K key, V value) {
        super.put(key, value);
        return this;
    }
}


