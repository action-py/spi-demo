package org.example.design.template.hospital;

/**
 * 项目名称：demo-spi
 * 类 名 称：Demo
 * 类 描 述：TODO
 * 创建时间：2022/12/9 11:52
 * 创 建 人：panyong
 */
public class Demo {
    public static void main(String[] args) {
        Person3Hospital person3Hospital = new Person3Hospital();
        //person3Hospital.setNeedVerb(false);
        person3Hospital.work();
    }
}
