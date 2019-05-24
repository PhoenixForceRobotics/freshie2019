package org.usfirst.frc.team2097.robot.commands;

import org.usfirst.frc.team2097.robot.Utility.OI;
import org.usfirst.frc.team2097.robot.Utility.driverCont;
import org.usfirst.frc.team2097robot.Utility.driverCont;

import edu.wpi.first.wpilibj.utilities.subsystems.JankBase;

import org.usfirst.frc.team2097.robot.Robot;

/**
 *
 */
public class RunJankBase extends JankBase {
	
	private double scaleOne;
	private double scaleThree;

	private double driverLeft;
	private double driverRight;
	
	
	public RunJankBase() {
		
		requires(Robot.JankBase);


		driverRight = joyRightValX * Constants.scalerOne;



		//now lets tell the motors what to do, shall we





	}

	// Called just before this Command runs the first time
	@Override
	protected void initialize() {
	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute() {
	}

	// Make this return true when this Command no longer
	@Override
	protected boolean isFinished() {
		return false;
	}

	// Called once after isFinished returns true
	@Override
	protected void end() {
	}
 
	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	@Override
	protected void interrupted() {
	}
}
