package org.example.design.factory.simple;

import org.example.design.factory.base.Benz;
import org.example.design.factory.base.Car;

/**
 * 项目名称：demo-spi
 * 类 名 称：Demo
 * 类 描 述：TODO
 * 创建时间：2022/12/7 15:38
 * 创 建 人：panyong
 */
public class Demo {
    public static void main(String[] args) {
        Car bmw = Driver.create("Bmw");
        System.out.println(bmw);
        Car benz = Driver.create(Benz.class);
        System.out.println(benz);
    }
}
