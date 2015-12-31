package com.meme.handler.mybatis;

import com.meme.constants.TargetStatus;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by zhangb on 29/11/2015.
 */
public class TargetStatusHandler extends BaseTypeHandler<TargetStatus> {

    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, TargetStatus targetStatus, JdbcType jdbcType) throws SQLException {
        preparedStatement.setInt(i, targetStatus.getValue());
    }

    @Override
    public TargetStatus getNullableResult(ResultSet resultSet, String s) throws SQLException {
        return TargetStatus.generateType(resultSet.getInt(s));
    }

    @Override
    public TargetStatus getNullableResult(ResultSet resultSet, int i) throws SQLException {
        return TargetStatus.generateType(resultSet.getInt(i));
    }

    @Override
    public TargetStatus getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        return TargetStatus.generateType(callableStatement.getInt(i));
    }
}
