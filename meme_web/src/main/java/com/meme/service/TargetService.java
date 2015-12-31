package com.meme.service;

import com.meme.model.Target;
import com.meme.model.TargetContent;
import com.meme.model.User;

import java.util.List;

/**
 * Created by zhangb on 29/12/2015.
 */
public interface TargetService {

    List<Target> loadTargetListForUser(User user);

    void setNewTarget(User user, Target target);

    TargetContent loadTargetContent(Target target);
}
