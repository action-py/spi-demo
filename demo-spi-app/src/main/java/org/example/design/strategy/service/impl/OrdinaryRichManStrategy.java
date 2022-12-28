package org.example.design.strategy.service.impl;

import org.example.design.strategy.service.RichManStrategy;

/**
 * 项目名称：demo-spi
 * 类 名 称：OrdinaryRichManStrategy
 * 类 描 述：TODO
 * 创建时间：2022/12/1 17:29
 * 创 建 人：panyong
 */
public class OrdinaryRichManStrategy implements RichManStrategy {
    public void mode() {
        System.out.println("中策 : 自己创业、搞副业，把握时代的机遇，乘着时势的巨浪扬帆起航 ---》未来可期");
    }
}
