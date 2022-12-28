package org.example.design.template.game;

/**
 * 项目名称：demo-spi
 * 类 名 称：SupperMerryGame
 * 类 描 述：TODO
 * 创建时间：2022/12/7 19:28
 * 创 建 人：panyong
 */
public class SupperMerryGame extends GameTemplate{
    @Override
    protected void runGame(String gameName) {
        System.out.println(gameName+"------------运行游戏---------------------");
    }

    @Override
    public void choosePerson(String gameName) {
        System.out.println(gameName+"------------选择角色---------------------");
    }

    @Override
    public void startPlayGame(String gameName) {
        System.out.println(gameName+"----------------启动游戏--------------------------");
    }

    @Override
    public void endPlayGame(String gameName) {
        System.out.println(gameName+"----------------结束游戏--------------------------");
    }
}
