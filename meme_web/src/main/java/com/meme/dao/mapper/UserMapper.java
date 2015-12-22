package com.meme.dao.mapper;

import com.meme.model.User;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

/**
 * Created by zhangb on 27/11/2015.
 */

public interface UserMapper {
//
//    @Results({
//            @Result(property = "userId", column = "user_id"),
//            @Result(property = "userName", column = "user_name"),
//            @Result(property = "birthday", column = "birthday"),
//            @Result(property = "sex", column = "sex"),
//            @Result(property = "emailAddress", column = "email_address"),
//            @Result(property = "mobile", column = "mobile"),
//            @Result(property = "userType", column = "user_type")
//    })

//    @Select("select user_id ,user_name ," +
//            "birthday ,sex ,email_address ," +
//            " mobile,user_type  " +
//            "from e_user where user_id={#userId}")
    User selectUserById(Integer userId);

//    @Select("insert into e_user(" +
//            "user_id, user_name,birthday, sex,email_address," +
//            "mobile ,user_type ) " +
//            "values({#userId}, {#userName}, {#birthday}, {#sex}, {#emailAddress}" +
//            ", {#mobile}, {#userType})")
    int insertUser(User user);


    User selectUserByUserName(String userName);
    User selectUserByUserNameIgnoreCase(String userName);




}
