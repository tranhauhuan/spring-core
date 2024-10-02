package example2.model;

import org.springframework.stereotype.Component;

@Component
public class Animal {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
