package org.AOP;

import org.AOP.Config.BeanConfig;
import org.AOP.ShoppingCart.ShoppingCart;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        ShoppingCart bean = context.getBean(ShoppingCart.class);
        bean.checkout("CALLED");
        System.out.println(bean.quantity());
    }
}