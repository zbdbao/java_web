package com.meme.dao;

import com.meme.constants.UserCredentialStatus;
import com.meme.dao.mapper.UserCredentialMapper;
import com.meme.dao.mapper.UserMapper;
import com.meme.model.User;
import com.meme.model.UserCredential;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by zhangb on 30/11/2015.
 */
@Component
@Transactional
public class UserDao extends BaseDao{
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserCredentialMapper userCredentialMapper;

    public User selectUserById(Integer userId){
        return userMapper.selectUserById(userId);
    }

//    @Transactional(noRollbackFor = RuntimeException.class)
    public User registerUser(User user, UserCredential userCredential){

        userMapper.insertUser(user);
//        user = userMapper.selectUserByUserName(user.getUserName());
        logger.info("user id:: {}", user.getUserId());
        userCredential.setUserId(user.getUserId());

        userCredentialMapper.insert(userCredential);

        return user;
    }

    public User selectUserByUserNameIgnoreCase(String userName){
        userName = userName.toUpperCase();
        return userMapper.selectUserByUserNameIgnoreCase(userName);
    }

    public UserCredential selectUserCredentialByUserId(Integer userId, UserCredentialStatus userCredentialStatus){
        return userCredentialMapper.selectUserCredentialByUserId(userId, userCredentialStatus);
    }
}
