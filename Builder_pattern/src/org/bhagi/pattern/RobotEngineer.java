package org.bhagi.pattern;

public class RobotEngineer {
private AbstractRobotBuilder robotBuilder;
	
	// OldRobotBuilder specification is sent to the engineer
	
	public RobotEngineer(AbstractRobotBuilder robotBuilder){
		
		this.robotBuilder = robotBuilder;
		
	}
	
	// Return the Robot made from the OldRobotBuilder spec
	
	public ProductRobot getRobot(){
		
		return this.robotBuilder.getRobot();
		
	}
	
	// Execute the methods specific to the RobotBuilder 
	// that implements RobotBuilder (OldRobotBuilder)
	
	public void makeRobot() {
		
		this.robotBuilder.buildRobotHead();
		this.robotBuilder.buildRobotTorso();
		this.robotBuilder.buildRobotArms();
		this.robotBuilder.buildRobotLegs();
		
	}
}
