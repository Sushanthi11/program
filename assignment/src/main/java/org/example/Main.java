package org.example;

import org.example.shanthi.Student;
import org.example.shanthi.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static jdk.internal.org.jline.utils.Colors.s;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new
                ClassPathXmlApplicationContext("applicationContext.xml");
        StudentService studentService = (StudentService)
                context.getBean("studentService");
        Student s=context.getBean("student", Student.class);
        s.display();
    }

}

