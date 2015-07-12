package org.bhagi.pattern;

public class ConcreteRoboteBuilder implements AbstractRobotBuilder {

	private ProductRobot robot;
	
	public ConcreteRoboteBuilder(){
		this.robot=new ProductRobot();
	}
	
	
	public void buildRobotHead() {
		robot.setRobotHead("Head");
		
	}

	public void buildRobotTorso() {
		robot.setRobotTorso("Toto");
		
	}

	public void buildRobotArms() {
		robot.setRobotArms("Arms");
		
	}

	public void buildRobotLegs() {
		robot.setRobotLegs("legs");
		
	}

	public ProductRobot getRobot() {
		// TODO Auto-generated method stub
		return this.robot;
	}

}
