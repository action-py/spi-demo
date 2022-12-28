package org.example.design.factory.abstractfactory.good.benz;

/**
 * 项目名称：demo-spi
 * 类 名 称：BenzBusinessCar
 * 类 描 述：TODO
 * 创建时间：2022/12/7 17:01
 * 创 建 人：panyong
 */
public class BenzBusinessCar extends BenzCar{
    @Override
    public void drive() {
        System.out.println(this.getName()+"----BenzBusinessCar-----------------------");
    }
}
