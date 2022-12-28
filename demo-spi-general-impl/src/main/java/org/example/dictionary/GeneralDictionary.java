package org.example.dictionary;

import org.example.spi.Dictionary;

import java.util.SortedMap;
import java.util.TreeMap;

/**
 * 项目名称：demo-spi
 * 类 名 称：GeneralDictionary
 * 类 描 述：TODO
 * 创建时间：2022/10/5 22:21
 * 创 建 人：panyong
 */
public class GeneralDictionary implements Dictionary {

    private SortedMap<String, String> map;

    /** Creates a new instance of GeneralDictionary */
    public GeneralDictionary() {
        map = new TreeMap<String, String>();
        map.put(
                "book",
                "a set of written or printed pages, usually bound with " +
                        "a protective cover");
        map.put(
                "editor",
                "a person who edits");
    }

    @Override
    public String getDefinition(String word) {
        return map.get(word);
    }
}
