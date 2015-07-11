package org.bhagi.pattern;

public class ConcreteRoboteBuilder implements AbstractRobotBuilder {

	private ProductRobot robot;
	
	public ConcreteRoboteBuilder(){
		this.robot=new ProductRobot();
	}
	
	@Override
	public void buildRobotHead() {
		robot.setRobotHead("Head");
		
	}

	@Override
	public void buildRobotTorso() {
		robot.setRobotTorso("Toto");
		
	}

	@Override
	public void buildRobotArms() {
		robot.setRobotArms("Arms");
		
	}

	@Override
	public void buildRobotLegs() {
		robot.setRobotLegs("legs");
		
	}

	@Override
	public ProductRobot getRobot() {
		// TODO Auto-generated method stub
		return this.robot;
	}

}
