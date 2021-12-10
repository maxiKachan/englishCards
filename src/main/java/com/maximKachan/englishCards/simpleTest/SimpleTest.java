package com.maximKachan.englishCards.simpleTest;

import com.maximKachan.englishCards.model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SimpleTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring-context.xml");
        User user = (User) context.getBean("user");
        System.out.println(user);
    }
}
