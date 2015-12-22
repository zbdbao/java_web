package com.meme.handler.mybatis;

import com.meme.constants.Sex;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by zhangb on 29/11/2015.
 */
public class SexHandler extends BaseTypeHandler<Sex> {


    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, Sex sex, JdbcType jdbcType) throws SQLException {
        preparedStatement.setString(i, sex.getValue());
    }

    @Override
    public Sex getNullableResult(ResultSet resultSet, String s) throws SQLException {
        return Sex.get(resultSet.getString(s));
    }

    @Override
    public Sex getNullableResult(ResultSet resultSet, int i) throws SQLException {
        return Sex.get(resultSet.getString(i));
    }

    @Override
    public Sex getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        return Sex.get(callableStatement.getString(i));
    }
}
