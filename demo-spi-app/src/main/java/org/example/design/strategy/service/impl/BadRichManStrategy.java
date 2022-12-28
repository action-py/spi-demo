package org.example.design.strategy.service.impl;

import org.example.design.strategy.service.RichManStrategy;

/**
 * 项目名称：demo-spi
 * 类 名 称：BadRichManStrategy
 * 类 描 述：TODO
 * 创建时间：2022/12/1 17:34
 * 创 建 人：panyong
 */
public class BadRichManStrategy implements RichManStrategy {
    public void mode() {
        System.out.println("下策 : 找个班上，为公司的明天努力奋斗 ---》洗洗睡吧，所思即所得");
    }
}
