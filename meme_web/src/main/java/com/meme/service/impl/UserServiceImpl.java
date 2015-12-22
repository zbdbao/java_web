package com.meme.service.impl;

import com.meme.constants.*;
import com.meme.dao.UserDao;
import com.meme.exception.UserAuthException;
import com.meme.model.User;
import com.meme.model.UserCredential;
import com.meme.service.UserService;
import com.meme.utils.CommanUtils;
import com.meme.utils.EncryptUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.Date;

/**
 * Created by zhangb on 26/11/2015.
 */
@Component
public class UserServiceImpl implements UserService {
    final static Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
    @Autowired
    private UserDao userDao;

    @Override
    public User getUser(int id) {
        logger.info("Get user by user id:"+id);
//        userDao.selectUserById(id);
//        registerUser(null);
        return userDao.selectUserById(id);

    }

    @Override
    public User registerUser(User user, UserType userType) {

        user.setUserType(userType);
        logger.info("Save for registered user:{}", user);

        UserCredential userCredential = new UserCredential();
        userCredential.setPassword(user.generateEncryptedPassword());
        userCredential.setStatus(UserCredentialStatus.VALID);

        User registedUser = userDao.registerUser(user, userCredential);
        logger.info("Registered successfully user:{}", registedUser);

        return registedUser;
    }

    @Override
    public boolean deleteUser(User user) {
        return false;
    }

    @Override
    public boolean isUserNameExist(String userName) {
        if(StringUtils.isEmpty(userName)){
            return false;
        }else {
            User user = userDao.selectUserByUserNameIgnoreCase(userName);
            if(user != null && user.getUserId() > 0){
                return true;
            }
        }
        return false;
    }


    @Override
    public boolean isUserValid(String userName) {
        if(StringUtils.isEmpty(userName)){
            return false;
        }else {
            User user = userDao.selectUserByUserNameIgnoreCase(userName);
            if(CommanUtils.isUserValid(user)){
                return true;
            }
        }
        return false;
    }

    @Override
    public User loginUser(String userName, String password) throws UserAuthException {
        User user = userDao.selectUserByUserNameIgnoreCase(userName);

        if(CommanUtils.isUserValid(user)){
            UserCredential userCredential = userDao.selectUserCredentialByUserId(user.getUserId(), UserCredentialStatus.VALID);
            if(userCredential !=null
                    && userCredential.getStatus()==UserCredentialStatus.VALID
                    && EncryptUtil.match(password, userCredential.getPassword())){
                return user;
            }else {
                throw new UserAuthException(ExceptionStatus.INVALID_PASSWORD);
            }

        }else {
            throw new UserAuthException(ExceptionStatus.INVALID_USER);
        }

    }
}
