package com.meme.handler.mybatis;

import com.meme.constants.Sex;
import com.meme.constants.UserType;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by zhangb on 29/11/2015.
 */
public class UserTypeHandler extends BaseTypeHandler<UserType> {

    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, UserType userType, JdbcType jdbcType) throws SQLException {
        preparedStatement.setInt(i, userType.getValue());
    }

    @Override
    public UserType getNullableResult(ResultSet resultSet, String s) throws SQLException {
        return UserType.generateType(resultSet.getInt(s));
    }

    @Override
    public UserType getNullableResult(ResultSet resultSet, int i) throws SQLException {
        return UserType.generateType(resultSet.getInt(i));
    }

    @Override
    public UserType getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        return UserType.generateType(callableStatement.getInt(i));
    }
}
