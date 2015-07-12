package org.bhagi.pattern.ChainOfResponsibility;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Handler h1 = new ConcreteHandlerOne();
    	Handler h2 = new ConcreteHandlerTwo();
    	h1.setSuccessor(h2);
    	h1.handleRequest(new Request("Negative Value ", 1));
    }
}
