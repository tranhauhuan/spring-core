package main;

import config.ProjectConfig;
import model.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person p = context.getBean(Person.class);
        p.setFirstName("Huan");
        p.setLastName("Tran");
        System.out.println(p.getFirstName());
        System.out.println(p.getLastName());
    }
}
