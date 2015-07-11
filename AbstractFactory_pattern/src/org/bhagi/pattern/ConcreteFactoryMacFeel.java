package org.bhagi.pattern;

public class ConcreteFactoryMacFeel extends AbstractFactoryLookAndFeel {
	AbstractProductButton createButton(){
		return new ProductMacButton();
	}
	AbstractProductTextField createTextArea(){
		return new ProductMacTextArea();
	}
}
