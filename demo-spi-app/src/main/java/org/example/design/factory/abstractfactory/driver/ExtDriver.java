package org.example.design.factory.abstractfactory.driver;

import org.example.design.factory.abstractfactory.good.audi.AudiCar;
import org.example.design.factory.abstractfactory.good.benz.BenzCar;
import org.example.design.factory.abstractfactory.good.bmw.BmwCar;

/**
 * 项目名称：demo-spi
 * 类 名 称：ExtDriver
 * 类 描 述：简单工厂和抽象工厂的结合使用
 * 创建时间：2022/12/7 17:29
 * 创 建 人：panyong
 */
public class ExtDriver{
    public static BenzCar createBenzCar(Class clazz) {
        BenzCar benzCar = null;
        if(BenzCar.class.isAssignableFrom(clazz)) {
            try {
                benzCar = (BenzCar) Class.forName(clazz.getName()).newInstance();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        return benzCar;
    }

    public static BmwCar createBmwCar(Class clazz) {
        BmwCar bmwCar = null;
        if(BmwCar.class.isAssignableFrom(clazz)) {
            try {
                bmwCar = (BmwCar) Class.forName(clazz.getName()).newInstance();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        return bmwCar;
    }

    public static AudiCar createAudiCar(Class clazz) {
        AudiCar audiCar = null;
        if(AudiCar.class.isAssignableFrom(clazz)) {
            try {
                audiCar = (AudiCar) Class.forName(clazz.getName()).newInstance();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        return audiCar;
    }
}
