package aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class GoodByeServiceAspect {
    @Around("execution(* services.GoodByeService.goodBye(..))")
    public Object around(ProceedingJoinPoint joinPoint) {
        System.out.println("Before");
        Object result = null;
        try {
            result = joinPoint.proceed();
            System.out.println("After");
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
        return result;
    }
}
