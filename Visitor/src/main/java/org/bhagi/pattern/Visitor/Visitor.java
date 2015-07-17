package org.bhagi.pattern.Visitor;

public interface Visitor {
	public double visit(Liquor liquorItem);
	
	public double visit(Tobacco tobaccoItem);
	
	public double visit(Necessity necessityItem);
}