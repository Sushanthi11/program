package org.example;

import org.example.Employee.Project;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Project p = context.getBean("pro", Project.class);
        p.display();
    }
}