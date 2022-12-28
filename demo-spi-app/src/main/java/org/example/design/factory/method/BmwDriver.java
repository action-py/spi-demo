package org.example.design.factory.method;

import org.example.design.factory.base.Bmw;
import org.example.design.factory.base.Car;

/**
 * 项目名称：demo-spi
 * 类 名 称：BmwDriver
 * 类 描 述：TODO
 * 创建时间：2022/12/7 16:06
 * 创 建 人：panyong
 */
public class BmwDriver extends AbstractDriver{
    @Override
    public Car createCar(String car) {
        return new Bmw();
    }
}
