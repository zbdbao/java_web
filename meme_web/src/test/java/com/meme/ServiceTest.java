package com.meme;

import com.meme.model.Target;
import com.meme.model.TargetContent;
import com.meme.model.User;
import com.meme.service.TargetService;
import com.meme.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 * Created by zhangb on 31/12/2015.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:meme-context.xml",
        "classpath:meme-context.xml"})
public class ServiceTest {

    String content = "因为Spring需要启动IOC容器后才能使用，特别是把数据库相关的配置集成在Spring中，必须启动Spring才能执行，因此我们不得不在测试代码中加入papapa的Spring启动代码，这些代码看起来其实多余了\n" +
            "\n" +
            "我们来看看SpringTest这个神器，它可以让你减少测试代码，采用注解方式控制Spring的ioc容器的启动，减少测试代码。\n" +
            "\n" +
            "不仅仅如此，我们还可以再Test类的成员变量中使用@Resource、@Autowired注解来注入对象";

    @Autowired
    TargetService targetService;
    @Autowired
    UserService userService;

    private User user;

    @Before
    public void setup(){
        user = userService.getUser(37);

    }

    @Test
    public void insertTareget() throws ParseException {
        Target target = new Target();
        TargetContent targetContent = new TargetContent();

        targetContent.setContent(content);

        target.setUserId(user.getUserId());

        target.setTargetCompleteTime(new SimpleDateFormat("yyyy-MM-dd").parse("2016-01-30"));
        target.setTargetTittle("The spring content");
        target.setTargetContent(targetContent);

        targetService.setNewTarget(user, target);
    }


    @Test
    public void loadTaregets() throws ParseException {
        List<Target> targetList = targetService.loadTargetListForUser(user);

        for (Target target:targetList) {

            System.out.println("target:"+target);
        }
    }
}
