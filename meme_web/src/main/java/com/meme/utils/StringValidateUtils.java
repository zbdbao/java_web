package com.meme.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by zhangb on 29/11/2015.
 */
public class StringValidateUtils {

    private static Logger logger = LoggerFactory.getLogger(StringValidateUtils.class);


    private static final String EMAIL_REGEX = "^\\s*\\w+(?:\\.{0,1}[\\w-]+)*@[a-zA-Z0-9]+(?:[-.][a-zA-Z0-9]+)*\\.[a-zA-Z]+\\s*$";
    public static boolean validateEmail(String emailAddress){

        boolean flag = validate(EMAIL_REGEX, emailAddress);

        logger.debug("result of validate email address-{}, is: {}", emailAddress, flag);
        return flag;
    }

    private static final String CN_MOBILE_REGEX = "^（（13[0-9]）|（15[0-9]）|（18[0,5-9]））\\d{8}$";
    public static boolean validateCNMobile(String mobileNum){

        boolean flag = validate(CN_MOBILE_REGEX, mobileNum);

        logger.debug("result of validate CN mobile-{}, is: {}", mobileNum, flag);
// TODO: 30/11/2015 return true;
//        return flag;
        return true;
    }

    private static final String GEN_MOBILE_REGEX = "(\\\\+\\\\d+)?\\\\d$";
    public static boolean validateGenMobile(String mobileNum){
        boolean flag = validate(GEN_MOBILE_REGEX, mobileNum);

        logger.debug("result of validate global mobile-{}, is: {}", mobileNum, flag);

        return flag;
    }


    public static boolean validate(String regexStr, String value){
        boolean flag;
        try{
            Pattern regex = Pattern.compile(regexStr);
            Matcher matcher = regex.matcher(value);
            flag = matcher.matches();
        }catch(Exception e){
            flag = false;
        }
        logger.debug("result of validate pattern-{}, value-{}, is: {}", regexStr, value, flag);

        return flag;
    }
}
