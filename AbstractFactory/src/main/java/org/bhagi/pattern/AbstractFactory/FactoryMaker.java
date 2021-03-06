package org.bhagi.pattern.AbstractFactory;

public class FactoryMaker {
	

	static AbstractFactoryLookAndFeel getFactory(String choice) {
		if (choice.equals("WIN")) {
			return  new ConcreteFactoryWindowsFeel();
		} if (choice.equals("MAC")) {
			return new ConcreteFactoryMacFeel();
		}
		return null;
	}
}
