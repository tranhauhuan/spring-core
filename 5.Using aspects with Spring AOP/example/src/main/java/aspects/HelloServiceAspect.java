package aspects;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class HelloServiceAspect {
    @Before("execution(* services.HelloService.hello(..))")
    public void before() {
        System.out.println("Before");
    }

    @After("execution(* services.HelloService.hello(..))")
    public void after() {
        System.out.println("After");
    }
    @AfterReturning("execution(* services.HelloService.hello(..))")
    public void afterRunning() {
        System.out.println("After running");
    }

    @AfterThrowing("execution(* services.HelloService.hello(..))")
    public void afterThrowing() {
        System.out.println("After throwing");
    }

}
