package com.sami.ex7_bean_scopes;

import com.sami.ex7_bean_scopes.beans.MyService;
import com.sami.ex7_bean_scopes.beans.UserSession;
import com.sami.ex7_bean_scopes.config.ProjectScopeConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example7 {
    static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectScopeConfig.class);

        var myService1 = context.getBean(MyService.class);
        var myService2 = context.getBean(MyService.class);
        System.out.println(myService1.hashCode());
        System.out.println(myService2.hashCode());

        var user1 = context.getBean(UserSession.class);
        var user2 = context.getBean(UserSession.class);
        System.out.println(user1.hashCode());
        System.out.println(user2.hashCode());
    }
}
