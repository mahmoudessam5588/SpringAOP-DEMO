package org.AOP.AuthenticationAuthorization;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AuthenticationAuthorizationAspect {
    @Pointcut(value = "within(org.AOP..*)")
    public void authenticationPointCut(){}
    @Pointcut(value = "within(org.AOP.ShoppingCart.*)")
    public void authorizationPointCut(){}
    @Before(value = "authenticationPointCut() && authorizationPointCut()")
    public void authenticate(){
        System.out.println("Authentication The Request ");
    }

}
