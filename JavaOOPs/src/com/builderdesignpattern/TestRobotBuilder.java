package com.builderdesignpattern;

public class TestRobotBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      RobotBuilder oldStyleRobot = new OldRobotBuilder();
      RobotEngineer robotEngineer = new RobotEngineer(oldStyleRobot);
	
	    robotEngineer.makerobot();
	    Robot firstRobot= robotEngineer.getRobot();
	    
	    System.out.println("Robot Built");
	    
	    System.out.println("Robot Head Type  " +firstRobot.getRobotHead());
	    System.out.println("Robot Torso Type  " +firstRobot.getRobotTorso());
	    System.out.println("Robot Arms Type "+firstRobot.getRobotArms());
	    System.out.println("Robot Legs Type " +firstRobot.getRobotLegs());
	    
}
}