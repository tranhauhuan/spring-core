package config;

import model.Person;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ProjectConfig {

    @Bean
    @Scope(BeanDefinition.SCOPE_PROTOTYPE)
    Person person() {
        Person p = new Person();
        p.setFirstName("first name");
        p.setLastName("last name");
        return p;
    }

}
