package org.example.design.template.game;

/**
 * 项目名称：demo-spi
 * 类 名 称：Demo
 * 类 描 述：TODO
 * 创建时间：2022/12/7 19:40
 * 创 建 人：panyong
 */
public class Demo {
    public static void main(String[] args) {
        SimplePlayStrategy simplePlayStrategy = new SimplePlayStrategy();
        GameTemplate supperMerryGame = new SupperMerryGame();
        CFGame cfGame = new CFGame();
        /*supperMerryGame.play("超级玛丽");
        cfGame.play("穿越火线");*/
        supperMerryGame.playExt(simplePlayStrategy,"超级玛丽");

    }
}
