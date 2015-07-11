package org.bhagi.pattern;

public class ConcreteFactoryWindowsFeel extends AbstractFactoryLookAndFeel {
	AbstractProductButton createButton(){
		return new ProductWindowsButton();
	}
	AbstractProductTextField createTextArea(){
		return new ProductWindowsTextArea();
	}
}
