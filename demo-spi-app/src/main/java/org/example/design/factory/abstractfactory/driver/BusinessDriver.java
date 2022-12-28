package org.example.design.factory.abstractfactory.driver;

import org.example.design.factory.abstractfactory.good.audi.AudiBusinessCar;
import org.example.design.factory.abstractfactory.good.audi.AudiCar;
import org.example.design.factory.abstractfactory.good.benz.BenzBusinessCar;
import org.example.design.factory.abstractfactory.good.benz.BenzCar;
import org.example.design.factory.abstractfactory.good.bmw.BmwBusinessCar;
import org.example.design.factory.abstractfactory.good.bmw.BmwCar;

/**
 * 项目名称：demo-spi
 * 类 名 称：BusinessDriver
 * 类 描 述：TODO
 * 创建时间：2022/12/7 17:20
 * 创 建 人：panyong
 */
public class BusinessDriver extends AbstractDriver{
    @Override
    public BenzCar createBenzCar(String car) {
        return new BenzBusinessCar();
    }

    @Override
    public BmwCar createBmwCar(String car) {
        return new BmwBusinessCar();
    }

    @Override
    public AudiCar createAudiCar(String car) {
        return new AudiBusinessCar();
    }
}
