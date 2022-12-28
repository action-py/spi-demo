package org.example.design.factory.method;

import org.example.design.factory.base.Benz;
import org.example.design.factory.base.Car;

/**
 * 项目名称：demo-spi
 * 类 名 称：BenzDriver
 * 类 描 述：TODO
 * 创建时间：2022/12/7 16:04
 * 创 建 人：panyong
 */
public class BenzDriver extends AbstractDriver{
    @Override
    public Car createCar(String car) {
        return new Benz();
    }
}
