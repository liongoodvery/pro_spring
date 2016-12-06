package com.apress.prospring4.ch3;

import com.apress.prospring4.ch3.annotation.User;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DeclareSpringComponents {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:META-INF/spring/app-context-annotation.xml");
        ctx.refresh();

        MessageProvider messageProvider = ctx.getBean("messageProvider",
            MessageProvider.class);

        User user = ctx.getBean("user", User.class);
        System.out.println(messageProvider.getMessage());
        System.out.println(user.getName());
    }
}
