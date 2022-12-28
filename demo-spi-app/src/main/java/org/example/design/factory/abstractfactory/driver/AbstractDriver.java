package org.example.design.factory.abstractfactory.driver;

import org.example.design.factory.abstractfactory.good.audi.AudiCar;
import org.example.design.factory.abstractfactory.good.benz.BenzCar;
import org.example.design.factory.abstractfactory.good.bmw.BmwCar;

/**
 * 项目名称：demo-spi
 * 类 名 称：AbstractDriver
 * 类 描 述：TODO
 * 创建时间：2022/12/7 17:14
 * 创 建 人：panyong
 */
public abstract class AbstractDriver {

    public abstract BenzCar createBenzCar(String car);

    public abstract BmwCar createBmwCar(String car);

    public abstract AudiCar createAudiCar(String car);
}
