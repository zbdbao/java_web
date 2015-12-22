package com.meme.converter;


import com.meme.constants.Sex;
import org.springframework.core.convert.converter.Converter;

/**
 * Created by zhangb on 30/11/2015.
 */
public class StringToSexConverter implements Converter<String, Sex> {


    @Override
    public Sex convert(String source) {
        return Sex.get(source);
    }
}
