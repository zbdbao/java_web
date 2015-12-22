package com.meme.beans.impl;

import com.meme.beans.UserService;

/**
 * Created by zhangb on 20/11/2015.
 */
public class UserServiceImpl implements UserService {

    public UserDetails getUserDetails(int userId) {

        if(userId > 100){
            return new UserDetails(userId, "Opt", "F","123123123");
        }else {
            return null;
        }
    }
}
