package com.meme.dao.mapper;

import com.meme.constants.UserCredentialStatus;
import com.meme.model.UserCredential;
import org.apache.ibatis.annotations.Param;

/**
 * Created by zhangb on 30/11/2015.
 */
public interface UserCredentialMapper {

    UserCredential selectUserCredentialByUserId(@Param("userId") Integer userId, @Param("status")UserCredentialStatus status);

    int insert(UserCredential userCredential);

}
