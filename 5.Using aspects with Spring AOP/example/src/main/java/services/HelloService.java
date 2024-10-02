package services;

import org.springframework.stereotype.Component;

@Component
public class HelloService {
    public void hello(String message) {
        System.out.println("Hello "+ message );
    }
}
