package main;

import config.ProjectConfig;
import model.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person p = context.getBean(Person.class);
        System.out.println(p.getFirstName());
        System.out.println(p.getLastName());

        Integer number = context.getBean(Integer.class);
        System.out.println(number);

        String name = context.getBean(String.class);
        System.out.println(name);
    }
}
