package org.bhagi.pattern.AbstractFactory;

public class ConcreteFactoryMacFeel extends AbstractFactoryLookAndFeel {
	AbstractProductButton createButton(){
		return new ProductMacButton();
	}
	AbstractProductTextField createTextArea(){
		return new ProductMacTextArea();
	}
}
