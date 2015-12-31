package com.meme.model;

import com.meme.constants.TargetStatus;
import com.meme.constants.TargetType;

import java.util.Date;

/**
 * Created by zhangb on 29/12/2015.
 */
public class Target {
    private long id;

    private int userId;
    private TargetType targetType;
    private TargetStatus targetStatus;

    private long superTargetId;
    private String targetTittle;
    private Date targetCreateTime;
    private Date targetCompleteTime;

    private TargetContent targetContent;

    public TargetContent getTargetContent() {
        return targetContent;
    }

    public void setTargetContent(TargetContent targetContent) {
        this.targetContent = targetContent;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public TargetType getTargetType() {
        return targetType;
    }

    public void setTargetType(TargetType targetType) {
        this.targetType = targetType;
    }

    public TargetStatus getTargetStatus() {
        return targetStatus;
    }

    public void setTargetStatus(TargetStatus targetStatus) {
        this.targetStatus = targetStatus;
    }

    public long getSuperTargetId() {
        return superTargetId;
    }

    public void setSuperTargetId(long superTargetId) {
        this.superTargetId = superTargetId;
    }

    public String getTargetTittle() {
        return targetTittle;
    }

    public void setTargetTittle(String targetTittle) {
        this.targetTittle = targetTittle;
    }

    public Date getTargetCreateTime() {
        return targetCreateTime;
    }

    public void setTargetCreateTime(Date targetCreateTime) {
        this.targetCreateTime = targetCreateTime;
    }

    public Date getTargetCompleteTime() {
        return targetCompleteTime;
    }

    public void setTargetCompleteTime(Date targetCompleteTime) {
        this.targetCompleteTime = targetCompleteTime;
    }
}
