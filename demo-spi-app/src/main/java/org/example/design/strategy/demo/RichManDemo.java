package org.example.design.strategy.demo;

import org.example.design.strategy.context.RichManContext;

import java.util.*;

/**
 * 项目名称：demo-spi
 * 类 名 称：RichManDemo
 * 类 描 述：如何成为一个富翁
 * 创建时间：2022/12/1 17:57
 * 创 建 人：panyong
 */
public class RichManDemo {
    private static String[] strategy = {"up","middle","down"};
    public static void main(String[] args) {
        System.err.println("如何成为一个富翁？");
        Random rand = new Random();
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            int random = rand.nextInt(3);
            String pattern = strategy[random];
            map.computeIfPresent(pattern,(k,v)-> v+1);
            map.computeIfAbsent(pattern,(k)-> 1);
            RichManContext richManContext = new RichManContext(pattern);
            richManContext.howToDO();
        }
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> next = iterator.next();
            double ratio = next.getValue() / 10.d;
            System.out.println(next.getKey()+":"+ratio);
        }

    }
}
