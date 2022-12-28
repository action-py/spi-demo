package org.example.design.factory.abstractfactory.good.bmw;

/**
 * 项目名称：demo-spi
 * 类 名 称：BmwBusinessCar
 * 类 描 述：TODO
 * 创建时间：2022/12/7 17:08
 * 创 建 人：panyong
 */
public class BmwBusinessCar extends BmwCar{
    @Override
    public void drive() {
        System.out.println(this.getName()+"----BmwBusinessCar-----------------------");
    }
}
