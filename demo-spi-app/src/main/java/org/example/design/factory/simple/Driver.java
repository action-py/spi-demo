package org.example.design.factory.simple;

import org.example.design.factory.base.Benz;
import org.example.design.factory.base.Bmw;
import org.example.design.factory.base.Car;

/**
 * 项目名称：demo-spi
 * 类 名 称：Driver
 * 类 描 述：简单工厂
 * 创建时间：2022/12/7 15:25
 * 创 建 人：panyong
 */
public class Driver {

    public static Car create(String name){
        Car car =null;
        if("Benz".equals(name)){
            car = new Benz();
        }
        if("Bmw".equals(name)){
            car = new Bmw();
        }
        return car;
    }

    public static Car create(Class clazz){
        Car car =null;
        if(Car.class.isAssignableFrom(clazz)){
            try {
                car = (Car) Class.forName(clazz.getName()).newInstance();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        return car;
    }
}
