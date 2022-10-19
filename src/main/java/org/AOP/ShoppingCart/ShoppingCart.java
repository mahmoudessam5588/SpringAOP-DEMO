package org.AOP.ShoppingCart;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {
    public void checkout(String status){
        //Join Point : Location where Point Cut {LoggingAspect --> loggers method} will be running
        //logging
        //authentication authorization // ==> all these aspect cutting concerns must be separated out
        //Sanitizing the data
        System.out.println("CheckOut Method From Shopping Cart " + status);
    }
    public int quantity(){
        return 5;
    }
}
