package org.example.design.template.hospital;

/**
 * 项目名称：demo-spi
 * 类 名 称：AbstractHospital
 * 类 描 述：TODO
 * 创建时间：2022/12/9 11:47
 * 创 建 人：panyong
 */
public abstract class AbstractHospital {
    /**
     * 挂号
     */
    protected abstract void register();

    /**
     * 看医生
     */
    protected abstract void seeDoc();

    /**
     * 各项检查
     */
    protected abstract void checkBody();

    /**
     * 治疗
     */
    protected abstract void verb();

    protected boolean checkNeedVerb=true;

    //钩子函数
    protected boolean checkNeedVerb(){
        return checkNeedVerb;
    }

    /**
     * 去医院看病
     */
    public final void work() {
        register();
        seeDoc();
        checkBody();
        if (checkNeedVerb()){

            verb();
        }
    }
}
