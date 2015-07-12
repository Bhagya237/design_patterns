package org.bhagi.pattern.AbstractFactory;

public class Client {

	public static void main(String[] args) {
		AbstractFactoryLookAndFeel pf=FactoryMaker.getFactory("WIN");
		AbstractProductButton product=pf.createButton();
		product.operationA1();

	}

}
