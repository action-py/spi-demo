package org.example.design.factory.base;

/**
 * 项目名称：demo-spi
 * 类 名 称：Car
 * 类 描 述：TODO
 * 创建时间：2022/12/7 15:18
 * 创 建 人：panyong
 */
public abstract class Car {
    private String name;
    public abstract void drive();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
