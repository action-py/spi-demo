package org.example.design.strategy.service.impl;

import org.example.design.strategy.service.RichManStrategy;

/**
 * 项目名称：demo-spi
 * 类 名 称：BestRichManStrategy
 * 类 描 述：TODO
 * 创建时间：2022/12/1 17:26
 * 创 建 人：panyong
 */
public class BestRichManStrategy implements RichManStrategy {
    public void mode() {
        System.out.println("上策 : 杀人放火、烧杀掳掠---》人生赢家指日可待");
    }
}
