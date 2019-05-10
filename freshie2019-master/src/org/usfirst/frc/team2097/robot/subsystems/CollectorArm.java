package org.usfirst.frc.team2097.robot.subsystems;

import org.usfirst.frc.team2097.robot.Constants;
import org.usfirst.frc.team2097.robot.subsystems.Utility.Motor;

import javax.naming.ldap.Control;

import com.revrobotics.CANSparkMaxLowLevel.MotorType;

public class BallCollector extends Subsystems
{
        private Motor collecter_rotate;
        private Motor collecter_rotate1, collecterio;
        
        public rotate(){

            collecter_rotate = new Motor(Constants.MotorMap.BallCollector.COLLECTER_ROTATE, kbrushless, Constants.MotorMap.BallCollector.COLLECTER_ROTATE_REVERSED);
            collecter_rotate1 = new Motor(Constants.MotorMap.BallCollector.COLLECTER_ROTATE1, kbrushless, Constants.MotorMap.BallCollector.COLLECTER_ROTATE1_REVERSED);
            collecterio = new Motor(Constants.MotorMap.BallCollector.COLLECTORIO, kbrushless, Constants.MotorMap.BallCollector.COLLECTORIO_REVERSED);
            collecter_rotate1.follow(collecter_rotate); //gotta make one rotater follow the other for simplicity
    }
            
    public void flopDown(ControlMode mode, double value){
        BALL_ROTATE.set(mode, value);
    }

    public void retract(ControlMode mode, double value){
        BALL_ROTATE.set(mode, -value);
    }

    public void killcollecter_rotate(){
    }
    
    public void initDefaultCommand(){
    }

}