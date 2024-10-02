package example2.main;

import example2.config.ProjectConfig;
import example2.model.Animal;
import example2.model.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Animal animal = context.getBean(Animal.class);
        animal.setName("Cat");
        System.out.println(animal.getName());

        Person person = context.getBean(Person.class);
//        person.setName("Huan");
        System.out.println(person.getName());
        System.out.println(person.getAnimal().getName());
    }
}
