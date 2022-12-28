package org.example.design.template.game;

/**
 * 项目名称：demo-spi
 * 类 名 称：GameTemplate
 * 类 描 述：TODO
 * 创建时间：2022/12/7 19:21
 * 创 建 人：panyong
 */
public abstract class GameTemplate {
    protected abstract void runGame(String gameName);
    protected abstract void choosePerson(String gameName);
    protected abstract void startPlayGame(String gameName);
    protected abstract void endPlayGame(String gameName);
    //原始模版方法 固化模板的执行步骤
    void play(String gameName){
        runGame(gameName);
        choosePerson(gameName);
        startPlayGame(gameName);
        endPlayGame(gameName);
    }

    /**
     * 模版增强，模板的执行步骤灵活组合，根据策略来执行模板不同的步骤
     * @param strategy  执行策略 ==》执行引擎
     * @param gameName  方法参数
     */
    void playExt(PlayStrategy strategy,String gameName){
        strategy.playMode(gameName,this);
    }
}
