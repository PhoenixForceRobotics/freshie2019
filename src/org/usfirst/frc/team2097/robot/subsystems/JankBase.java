package org.usfirst.frc.team2097.robot.subsystems;

import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team2097.robot.Constants;
import org.usfirst.frc.team2097.robot.subsystems.Utility.Motor;


//This is where the motors are imported



public static class JankBase extends subsystems{

    public Motor Left1, Left2, Left3;
    public Motor Right1, Right2, Right3;

        public JankBase(){

            Left1 = new Motor(Constants.MotorMap.Drivebase.DBTL1, kbrushed, Constants.MotorMap.Drivebase.DBTL1_REVERSE );
            Left2 = new Motor(Constants.MotorMap.Drivebase.DBTL2, kbrushed, Constants.MotorMap.Drivebase.DBTL2_REVERSE);
            Left3 = new Motor(Constants.MotorMap.Drivebase.DBTL3, kbrushed, Constants.MotorMap.Drivebase.DBTL3_REVERSE);
            //These are the left motors

            Right1 = new Motor(Constants.MotorMap.Drivebase.DBTR1, kbrushed, Constants.MotorMap.Drivebase.DBTR1_REVERSE);
            Right2 = new Motor(Constants.MotorMap.Drivebase.DBTR2, kbrushed, Constants.MotorMap.Drivebase.DBTR2_REVERSE);
            Right3 = new Motor(Constants.MotorMap.Drivebase.DBTR3, kbruhsed, Constants.MotorMap.Drivebase.DBTR3_REVERSE);
            //These are the right motors

            Left2.Left3.follow(Left1);
            Right2.Right3.follow(Right1);
            //This way the motors can hopefully run in unison
            
}       

        public leftSide(ControlMode mode, double value){
            
            Left1.set(mode, value);
            //this is the part that says this is the left of the robot
        }

        public rightSide(ControlMode mode, double value){

            Right1.set(mode, value);

        }

        public void initDefaultCommand(){
            
        }
}