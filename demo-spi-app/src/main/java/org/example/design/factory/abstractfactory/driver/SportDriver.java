package org.example.design.factory.abstractfactory.driver;

import org.example.design.factory.abstractfactory.good.audi.AudiCar;
import org.example.design.factory.abstractfactory.good.audi.AudiSportCar;
import org.example.design.factory.abstractfactory.good.benz.BenzCar;
import org.example.design.factory.abstractfactory.good.benz.BenzSportCar;
import org.example.design.factory.abstractfactory.good.bmw.BmwCar;
import org.example.design.factory.abstractfactory.good.bmw.BmwSportCar;

/**
 * 项目名称：demo-spi
 * 类 名 称：SportDriver
 * 类 描 述：TODO
 * 创建时间：2022/12/7 17:18
 * 创 建 人：panyong
 */
public class SportDriver extends AbstractDriver {
    @Override
    public BenzCar createBenzCar(String car) {
        return new BenzSportCar();
    }

    @Override
    public BmwCar createBmwCar(String car) {
        return new BmwSportCar();
    }

    @Override
    public AudiCar createAudiCar(String car) {
        return new AudiSportCar();
    }
}
