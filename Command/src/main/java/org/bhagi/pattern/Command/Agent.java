package org.bhagi.pattern.Command;


public class Agent {


    public Agent() {
    }
    
    void placeOrder(Order order) {
    	
        order.execute();
    }   
}
