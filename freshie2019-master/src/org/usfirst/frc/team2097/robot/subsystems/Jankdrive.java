package org.usfirst.frc.team2097.robot.subsystems;

import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team2097.robot.Constants;
import org.usfirst.frc.team2097.robot.subsystems.Utility.Motor;

public class Jandrive extends Subsystem {
    public Motor HD1;
    public Motor HD2;


    public Jankdrive(){

        HD1 = new Motor(Constants.MotorMap.HDrive.HD1, kbrushless, Constants.MotorMap.HDrive.HD1_REVERSE);
        HD2 = new Motor(Constants.MotorMap.Hdrive.HD2, kbrushless, Constants.MotorMap.Hdrive.HD2_REVERSE);
            //This lets the motors find the right spots


            HD2.follow(HD1);

    }
    
    public HD1(ControlMode mode, double value){

        HD1.set(mode, value);

    }


	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}
}
