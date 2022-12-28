package org.example.design.template.hospital;

/**
 * 项目名称：demo-spi
 * 类 名 称：Person3Hospital
 * 类 描 述：TODO
 * 创建时间：2022/12/9 11:49
 * 创 建 人：panyong
 */
public class Person3Hospital extends AbstractHospital{
    @Override
    protected void register() {
        System.out.println("我是第3个人来挂号");
    }

    @Override
    protected void seeDoc() {
        System.out.println("我是第3个人在看医生");
    }

    @Override
    protected void checkBody() {
        System.out.println("我是第3个人在进行身体检查");
    }

    @Override
    protected void verb() {
        System.out.println("我是第3个人开始治疗了");
    }

    @Override
    protected boolean checkNeedVerb() {
        return super.checkNeedVerb();
    }

    protected void setNeedVerb(boolean b){
        super.checkNeedVerb = b;
    }
}
