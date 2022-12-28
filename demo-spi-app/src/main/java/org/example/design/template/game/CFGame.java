package org.example.design.template.game;

/**
 * 项目名称：demo-spi
 * 类 名 称：TMNTGame
 * 类 描 述：TODO
 * 创建时间：2022/12/7 19:32
 * 创 建 人：panyong
 */
public class CFGame extends GameTemplate{
    @Override
    protected void runGame(String gameName) {
        System.err.println(gameName+"--------启动游戏--------");
    }

    @Override
    public void choosePerson(String gameName) {

    }

    @Override
    public void startPlayGame(String gameName) {
        System.err.println(gameName+"-------开始游戏---------");
    }

    @Override
    public void endPlayGame(String gameName) {
        System.err.println(gameName+"-----------结束游戏---------------");
    }
}
