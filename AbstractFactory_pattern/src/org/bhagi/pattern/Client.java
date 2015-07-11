package org.bhagi.pattern;

public class Client {

	public static void main(String[] args) {
		AbstractFactoryLookAndFeel pf=FactoryMaker.getFactory("MAC");
		AbstractProductButton product=pf.createButton();
		product.operationA1();

	}

}
