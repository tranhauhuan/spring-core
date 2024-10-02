package example1.config;

import example1.model.Animal;
import example1.model.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    Animal animal() {
        Animal a = new Animal();
        a.setName("Dog");
        return a;
    }

    //cach 1
    @Bean
    Person person(Animal animal) {
        Person p = new Person();
        p.setName("Huan");
        p.setAnimal(animal);
        return p;
    }

    //cach 2
//    @Bean
//    Person person() {
//        Person p = new Person();
//        p.setName("Huan");
//        p.setAnimal(animal());
//        return p;
//    }

}
