package com.dragon.designpatternsstudy.ssss;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryUsage;

public class dad {
    public static void main(String[] args) {
        MemoryMXBean memoryMXBean = ManagementFactory.getMemoryMXBean();
        MemoryUsage heapMemoryUsage = memoryMXBean.getHeapMemoryUsage();
        long init = heapMemoryUsage.getInit();
        long used = heapMemoryUsage.getUsed();
        long max = heapMemoryUsage.getMax();
        long committed = heapMemoryUsage.getCommitted();

        System.out.println("-----------" + init);
        System.out.println("-----------" + used);
        System.out.println("------------" + max);
        System.out.println("-----------" + committed);

    }
}
