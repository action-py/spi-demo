package org.example.design.factory.abstractfactory.good.audi;

/**
 * 项目名称：demo-spi
 * 类 名 称：AudiSportCar
 * 类 描 述：TODO
 * 创建时间：2022/12/7 17:13
 * 创 建 人：panyong
 */
public class AudiSportCar extends AudiCar{
    @Override
    public void drive() {
        System.out.println(this.getName()+"----AudiSportCar-----------------------");
    }
}
