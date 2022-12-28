package org.example;

import org.example.spi.Dictionary;

import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;

/**
 * 项目名称：demo-spi
 * 类 名 称：DictionaryService
 * 类 描 述：TODO
 * 创建时间：2022/10/5 19:24
 * 创 建 人：panyong
 */
public class DictionaryService {

    private static  DictionaryService service;

    private ServiceLoader<Dictionary> loader;

    private DictionaryService() {
        loader = ServiceLoader.load(Dictionary.class);
    }

    public static DictionaryService getInstance(){
        if(service==null){
            synchronized (DictionaryService.class){
                if(service==null){
                    service = new DictionaryService();
                }
            }
        }
        return service;
    }
    public String getDefinition(String word) {
        String definition = null;
        try {
            Iterator<Dictionary> dictionaries = loader.iterator();
            while (definition == null && dictionaries.hasNext()) {
                Dictionary d = dictionaries.next();
                definition = d.getDefinition(word);
            }
        } catch (ServiceConfigurationError serviceError) {
            definition = null;
            serviceError.printStackTrace();

        }
        return definition;
    }

}
