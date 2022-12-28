package org.example.dictionary;

import org.example.DictionaryService;

/**
 * 项目名称：demo-spi
 * 类 名 称：DictionaryDemo
 * 类 描 述：TODO
 * 创建时间：2022/10/5 22:35
 * 创 建 人：panyong
 */
public class DictionaryDemo {
    public static void main(String[] args) {
        DictionaryService instance = DictionaryService.getInstance();

        System.out.println(DictionaryDemo.lookup(instance, "book"));
        System.out.println(DictionaryDemo.lookup(instance, "editor"));
        System.out.println(DictionaryDemo.lookup(instance, "xml"));
        System.out.println(DictionaryDemo.lookup(instance, "REST"));
    }

    public static String lookup(DictionaryService dictionary, String word) {
        String outputString = word + ": ";
        String definition = dictionary.getDefinition(word);
        if (definition == null) {
            return outputString + "Cannot find definition for this word.";
        } else {
            return outputString + definition;
        }
    }
}
