package org.example.design.factory.base;

/**
 * 项目名称：demo-spi
 * 类 名 称：Bmw
 * 类 描 述：TODO
 * 创建时间：2022/12/7 15:25
 * 创 建 人：panyong
 */
public class Bmw extends Car{
    @Override
    public void drive() {
        System.out.println("这是一辆"+this.getName()+"--------");
    }
}
