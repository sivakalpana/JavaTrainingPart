package com.builderdesignpattern;

public class RobotEngineer {
private RobotBuilder robotBuilder;
 
public RobotEngineer(RobotBuilder robotbuilder) {
	this.robotBuilder = robotbuilder;
}
 public Robot getRobot() {
	 return this.robotBuilder.getRobot();
 }
 
  public void makerobot() {
	  this.robotBuilder.buildRobotHead();
	  this.robotBuilder.buildRobotTorso();
	  this.robotBuilder.buildRobotArms();
	  this.robotBuilder.buildRobotLegs();
  }
}
