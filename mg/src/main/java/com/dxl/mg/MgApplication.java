package com.dxl.mg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MgApplication {

    public static void main(String[] args) {
        // 1块钱
        double totalMoney = 1.0;

        // 分钱，确保每个人至少得到0.33元，避免出现小数精度问题
        double moneyForPerson = Math.max(totalMoney / 3.0, 0.33);

        // 分钱后剩余的钱
        double change = totalMoney - (moneyForPerson * 3);

        // 输出结果
        System.out.println("Person 1: " + moneyForPerson);
        System.out.println("Person 2: " + moneyForPerson);
        System.out.println("Person 3: " + moneyForPerson);
        System.out.println("Change: " + change);
    }
}
