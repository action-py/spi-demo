package org.example.design.factory.abstractfactory.demo;

import org.example.design.factory.abstractfactory.driver.ExtDriver;
import org.example.design.factory.abstractfactory.good.audi.AudiCar;
import org.example.design.factory.abstractfactory.good.audi.AudiSportCar;
import org.example.design.factory.abstractfactory.good.benz.BenzBusinessCar;
import org.example.design.factory.abstractfactory.good.benz.BenzCar;
import org.example.design.factory.abstractfactory.good.benz.BenzSportCar;
import org.example.design.factory.abstractfactory.driver.SportDriver;

/**
 * 项目名称：demo-spi
 * 类 名 称：BossAbstractFactory
 * 类 描 述：TODO
 * 创建时间：2022/12/7 17:23
 * 创 建 人：panyong
 */
public class BossAbstractFactory {
    public static void main(String[] args) {
        SportDriver sportDriver = new SportDriver();
        BenzCar benz = sportDriver.createBenzCar("benz");
        System.out.println(benz);
        System.out.println(benz instanceof BenzBusinessCar);
        System.err.println(benz instanceof BenzSportCar);
        AudiCar audiCar = ExtDriver.createAudiCar(AudiSportCar.class);
        System.out.println(audiCar);
    }
}
