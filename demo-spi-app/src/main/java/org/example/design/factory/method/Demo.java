package org.example.design.factory.method;

import org.example.design.factory.base.Car;

/**
 * 项目名称：demo-spi
 * 类 名 称：Demo
 * 类 描 述：工厂方法
 * 创建时间：2022/12/7 16:07
 * 创 建 人：panyong
 */
public class Demo {
    public static void main(String[] args) {
        BenzDriver benzDriver = new BenzDriver();
        Car benz = benzDriver.createCar("奔驰");
        System.out.println(benz);
        BmwDriver bmwDriver = new BmwDriver();
        Car bmw = bmwDriver.createCar("宝马");
        System.out.println(bmw);
    }
}
