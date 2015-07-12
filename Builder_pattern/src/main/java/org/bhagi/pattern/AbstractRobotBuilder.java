package org.bhagi.pattern;

public interface AbstractRobotBuilder {
	public void buildRobotHead();
	
	public void buildRobotTorso();
	
	public void buildRobotArms();
	
	public void buildRobotLegs();
	
	public ProductRobot getRobot();
}
