package com.mubeendev3.main;

import com.mubeendev3.beans.Employee;
import com.mubeendev3.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        String location = "com/mubeendev3/resources/applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(location);
        Student std = (Student) context.getBean("student");
        System.out.println("----------------------------------------------------------------------------");
        std.display();
        System.out.println("----------------------------------------------------------------------------");
        Employee employee = (Employee) context.getBean("employee");
        employee.display();
        System.out.println("----------------------------------------------------------------------------");
    }
}