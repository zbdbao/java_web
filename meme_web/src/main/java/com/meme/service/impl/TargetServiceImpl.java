package com.meme.service.impl;

import com.meme.constants.TargetStatus;
import com.meme.constants.TargetType;
import com.meme.dao.TargetDao;
import com.meme.model.Target;
import com.meme.model.TargetContent;
import com.meme.model.User;
import com.meme.service.TargetService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by zhangb on 26/11/2015.
 */
@Component
public class TargetServiceImpl implements TargetService {
    final static Logger logger = LoggerFactory.getLogger(TargetServiceImpl.class);
    @Autowired
    private TargetDao targetDao;

    @Override
    public List<Target> loadTargetListForUser(User user) {

        return targetDao.loadTargetList(user);
    }

    @Override
    public void setNewTarget(User user, Target target) {
        target.setUserId(user.getUserId());
        target.setTargetType(TargetType.TEXT);
        target.setTargetStatus(TargetStatus.INITED);

        targetDao.addTarget(target);

    }

    @Override
    public TargetContent loadTargetContent(Target target) {
        targetDao.selectTargetContentByTarget(target);
        return null;
    }
}
