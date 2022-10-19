package org.AOP.Logging;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class LoggingAspect {
    @Before(value ="execution(* org.AOP.ShoppingCart.ShoppingCart.checkout(. .))")
    public void beforeLoggers(JoinPoint jp){
        System.out.println(jp.getSignature());
        String stringArgs = Arrays.stream(jp.getArgs()).findFirst().toString();
        //Point Cuts :Define Where And How To Run
        System.out.println("Before Loggers Calling With Args: " + stringArgs);
    }
    @After(value ="execution(* org.AOP.ShoppingCart.ShoppingCart.checkout(. .))")
    public void afterLoggers(){
        System.out.println("After Loggers Calling");
    }
    @Pointcut("execution(* org.AOP.ShoppingCart.ShoppingCart.quantity(. .))")
    public void afterReturningPointCut(){}

    @AfterReturning(pointcut = "afterReturningPointCut()",returning = "returnVal")
    public void afterReturning(String returnVal){
        System.out.println("After Returning:" + returnVal);
    }

}
