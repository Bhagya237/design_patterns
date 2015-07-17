package org.bhagi.pattern.Momento;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 Originator originator = new Originator();
         CareTaker careTaker = new CareTaker();
         originator.setState("State #1");
         originator.setState("State #2");
         careTaker.add(originator.saveStateToMemento());

         System.out.println("Current State: " + originator.getState());	
    }
}
