package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=
                new ClassPathXmlApplicationContext("applicationContext.xml");
        RBI rbi=context.getBean("rbi",RBI.class);
        rbi.deposit();
        rbi.goldloan();
        rbi.internetbanking();
        rbi.loan();
        rbi.withdraw();

    }
}