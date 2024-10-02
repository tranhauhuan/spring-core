package config;

import model.Person;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {

    @Bean
    @Primary
    Person person() {
        Person p = new Person();
        p.setFirstName("Huan");
        p.setLastName("Tran");
        return p;
    }
    @Bean
    Person person2() {
        Person p = new Person();
        p.setFirstName("Tim");
        p.setLastName("Tran");
        return p;
    }

    @Bean
    Integer number() {
        return 10;
    }

    @Bean
    String name() {
        return "Huan";
    }
}
