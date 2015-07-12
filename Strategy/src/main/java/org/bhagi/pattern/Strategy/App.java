package org.bhagi.pattern.Strategy;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Robot r1 = new Robot("Big Robot");
		Robot r2 = new Robot("George v.2.1");
		
		r1.setBehaviour(new AgressiveBehaviour());
		r2.setBehaviour(new DefensiveBehaviour());
		
		r1.move();
		r2.move();
    }
}
