package org.example.dictionary;


import org.example.spi.Dictionary;

import java.util.SortedMap;
import java.util.TreeMap;

/**
 * 项目名称：demo-spi
 * 类 名 称：ExtendedDictionary
 * 类 描 述：TODO
 * 创建时间：2022/10/5 22:08
 * 创 建 人：panyong
 */
public class ExtendedDictionary implements Dictionary {
    private SortedMap<String, String> map;

    /**
     * Creates a new instance of ExtendedDictionary
     */
    public ExtendedDictionary() {
        map = new TreeMap<String, String>();
        map.put(
                "xml",
                "a document standard often used in web services, among other " +
                        "things");
        map.put(
                "REST",
                "an architecture style for creating, reading, updating, " +
                        "and deleting data that attempts to use the common " +
                        "vocabulary of the HTTP protocol; Representational State " +
                        "Transfer");
    }

    @Override
    public String getDefinition(String word) {
        return map.get(word);
    }
}
