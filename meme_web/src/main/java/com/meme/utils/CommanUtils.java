package com.meme.utils;

import com.meme.constants.UserType;
import com.meme.model.User;

/**
 * Created by zhangb on 4/12/2015.
 */
public class CommanUtils {

    public static boolean isUserValid(User user){

        if (user == null)
            return false;

        if(user.getUserType() != UserType.DISABLED && user.getUserId() > 0){
            return true;
        }
        return false;

    }
}
