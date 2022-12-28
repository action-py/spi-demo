package org.example.design.factory.method;

import org.example.design.factory.base.Car;

/**
 * 项目名称：demo-spi
 * 类 名 称：AbstractDriver
 * 类 描 述：抽象工厂
 * 创建时间：2022/12/7 16:02
 * 创 建 人：panyong
 */
public abstract class AbstractDriver {
    public abstract Car createCar(String car);
}
