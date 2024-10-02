package Main;

import config.ProjectConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.GoodByeService;
import services.HelloService;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
//        HelloService helloService = context.getBean(HelloService.class);
//        helloService.hello("Huan");
        GoodByeService goodByeService = context.getBean(GoodByeService.class);
        String result = goodByeService.goodBye("huan");
        System.out.println(result);
    }
}
