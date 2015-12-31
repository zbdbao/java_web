package com.meme.dao;

import com.meme.dao.mapper.TargetMapper;
import com.meme.model.Target;
import com.meme.model.TargetContent;
import com.meme.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by zhangb on 30/12/2015.
 */
@Component
@Transactional
public class TargetDao extends BaseDao{

    @Autowired
    private TargetMapper targetMapper;

    public List<Target> loadTargetList(User user){

        return targetMapper.getTargetListByUserId(user.getUserId());
    }


    public Target addTarget(Target target){

        logger.debug("Save for Target:{}", target);

        targetMapper.insertTarget(target);

        logger.info("Saved for target:{}", target.getId());

        target.getTargetContent().setTargetId(target.getId());
        targetMapper.insertTargetContent(target.getTargetContent());

        return target;
    }


    public List<TargetContent> selectTargetContentByTarget(Target target){

        logger.debug("selectTargetContentByTarget:{}", target.getId());

        return targetMapper.selectTargetContentByTargetId(target.getId());

    }
}
