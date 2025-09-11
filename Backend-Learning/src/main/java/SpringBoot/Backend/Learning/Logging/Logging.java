package SpringBoot.Backend.Learning.Logging;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logging {

    @Before("execution(public void SpringBoot.Backend.Learning.Service.UserService.logIn())")
    public void loggingAdvice1(){
        System.out.println("Before advice for logIn is executed");
    }

    @After("execution(public void SpringBoot.Backend.Learning.Service.UserService.logIn())")
    public void loggingAdvice2(){
        System.out.println("Running After Advice for logIn");
    }
}
