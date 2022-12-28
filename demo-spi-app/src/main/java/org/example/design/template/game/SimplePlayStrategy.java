package org.example.design.template.game;

/**
 * 项目名称：demo-spi
 * 类 名 称：SimplePlayStrategy
 * 类 描 述：TODO
 * 创建时间：2022/12/9 14:10
 * 创 建 人：panyong
 */
public class SimplePlayStrategy implements PlayStrategy{

    //执行引擎 ==》游戏运行的策略
    @Override
    public void playMode(String name,GameTemplate template) {
        template.runGame(name);
        template.startPlayGame(name);
        template.endPlayGame(name);
    }
}
