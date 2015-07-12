package org.bhagi.pattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractRobotBuilder oldStyleRobot = new ConcreteRoboteBuilder();
		RobotEngineer engineer =new RobotEngineer(oldStyleRobot);
		engineer.makeRobot();
		
		ProductRobot robot = engineer.getRobot();
		System.out.println(robot.getRobotArms());
	}

}
