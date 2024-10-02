package services;

import org.springframework.stereotype.Component;

@Component
public class GoodByeService {

    public String goodBye(String name) {
        String message = "Goodbye, " + name + "!";
        System.out.println(message);
        return message;
    }
}
