package com.meme.service;

import com.meme.constants.UserType;
import com.meme.exception.UserAuthException;
import com.meme.model.User;

/**
 * Created by zhangb on 26/11/2015.
 */
public interface UserService {

    User getUser(int id);
    User registerUser(User user, UserType userType);

    boolean deleteUser(User user);

    boolean isUserNameExist(String userName);
    boolean isUserValid(String userName);

    User loginUser(String userName, String password) throws UserAuthException;
}
