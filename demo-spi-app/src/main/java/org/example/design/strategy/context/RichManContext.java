package org.example.design.strategy.context;

import org.example.design.strategy.service.RichManStrategy;
import org.example.design.strategy.service.impl.BadRichManStrategy;
import org.example.design.strategy.service.impl.BestRichManStrategy;
import org.example.design.strategy.service.impl.OrdinaryRichManStrategy;

import java.util.HashMap;
import java.util.Map;

/**
 * 项目名称：demo-spi
 * 类 名 称：RichManContext
 * 类 描 述：TODO
 * 创建时间：2022/12/1 17:42
 * 创 建 人：panyong
 */
public class RichManContext {
    private RichManStrategy richManStrategy;
    private static Map<String,RichManStrategy> strategyPatten;
    static {
        strategyPatten = new HashMap<String,RichManStrategy>(){{
            put("up",new BestRichManStrategy());
            put("middle",new OrdinaryRichManStrategy());
            put("down",new BadRichManStrategy());
        }};
    }
    //原始策略模式：由客户端提供使用的具体策略实例
    public RichManContext(RichManStrategy richManStrategy) {
        this.richManStrategy = richManStrategy;
    }
    //原始策略模式：由客户端提供使用的具体策略类
    public RichManContext(Class clazz)  {
        try {
            this.richManStrategy = (RichManStrategy)Class.forName(clazz.getName()).newInstance();
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public RichManContext(String patten) {
        this.richManStrategy = strategyPatten.get(patten);
    }

    public void howToDO(){
        richManStrategy.mode();
    }
}
