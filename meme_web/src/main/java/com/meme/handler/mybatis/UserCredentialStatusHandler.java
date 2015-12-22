package com.meme.handler.mybatis;

import com.meme.constants.UserCredentialStatus;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by zhangb on 30/11/2015.
 */
public class UserCredentialStatusHandler extends BaseTypeHandler<UserCredentialStatus> {

    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, UserCredentialStatus status, JdbcType jdbcType) throws SQLException {
        preparedStatement.setInt(i, status.getValue());
    }

    @Override
    public UserCredentialStatus getNullableResult(ResultSet resultSet, String s) throws SQLException {
        return UserCredentialStatus.generateType(resultSet.getInt(s));
    }

    @Override
    public UserCredentialStatus getNullableResult(ResultSet resultSet, int i) throws SQLException {
        return UserCredentialStatus.generateType(resultSet.getInt(i));
    }

    @Override
    public UserCredentialStatus getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        return UserCredentialStatus.generateType(callableStatement.getInt(i));
    }
}
