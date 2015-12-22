package com.meme.repository;

import com.meme.constants.Sex;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhangb on 1/12/2015.
 */
public class EnumRepository {
    private static Map<String, String> sexMap ;

    public static Map<String, String> getSexMap(){
        if (sexMap == null){
            sexMap = new HashMap<String, String>();
            EnumSet<Sex> sexs = EnumSet.allOf(Sex.class);
            for (Sex sex : sexs) {
                sexMap.put(sex.getValue(), sex.getDescription());
            }
        }

        return sexMap;
    }

}
