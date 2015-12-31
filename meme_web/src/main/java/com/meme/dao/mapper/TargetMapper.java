package com.meme.dao.mapper;

import com.meme.model.Target;
import com.meme.model.TargetContent;

import java.util.List;

/**
 * Created by zhangb on 30/12/2015.
 */
public interface TargetMapper {
    List<Target> getTargetListByUserId(int userId);

    void insertTarget(Target target);
    void insertTargetContent(TargetContent targetContent);

    List<TargetContent> selectTargetContentByTargetId(Long targetId);


}
