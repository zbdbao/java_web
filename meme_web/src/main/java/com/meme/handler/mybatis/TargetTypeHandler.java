package com.meme.handler.mybatis;

import com.meme.constants.TargetType;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by zhangb on 29/11/2015.
 */
public class TargetTypeHandler extends BaseTypeHandler<TargetType> {

    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, TargetType targetType, JdbcType jdbcType) throws SQLException {
        preparedStatement.setInt(i, targetType.getValue());
    }

    @Override
    public TargetType getNullableResult(ResultSet resultSet, String s) throws SQLException {
        return TargetType.generateType(resultSet.getInt(s));
    }

    @Override
    public TargetType getNullableResult(ResultSet resultSet, int i) throws SQLException {
        return TargetType.generateType(resultSet.getInt(i));
    }

    @Override
    public TargetType getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        return TargetType.generateType(callableStatement.getInt(i));
    }
}
