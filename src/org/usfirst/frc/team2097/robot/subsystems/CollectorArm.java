package org.usfirst.frc.team2097.robot.subsystems;

import org.usfirst.frc.team2097.robot.Constants;
import org.usfirst.frc.team2097.robot.subsystems.Utility.Motor;

import javax.naming.ldap.Control;

import com.revrobotics.CANSparkMaxLowLevel.MotorType;

public class CollectorArm extends Subsystems
{
    private Motor collecter_rotate, collecter_rotate1;
        
        public rotate()
        {
            collector_arm_rotater = new Motor(Constants.MotorMap.BallCollector.COLLECTOR_ARM_ROTATER, kbrushless, Constants.MotorMap.BallCollector.COLLECTOR_ROTATER_REVERSED);
            collector_arm_rotater1 = new Motor(Constants.MotorMap.BallCollector.COLLECTOR_ARM_ROTATER1, kbrushless, Constants.MotorMap.BallCollector.COLLECTOR_ROTATER1_REVERSED);
            //gotta make one spinnin follow the other for simplicity
            collector_arm_rotater1.follow(collector_arm_rotater);
        }
            
    public void flopDown(double speed)
    {
        rotate.set(speed);
    }

    public void retract(double speed)
    {
        rotate.set(-speed);
    }

    public void killcollecter_arm_rotate()
    {
        rotate.set(0);
    }
    
    public void initDefaultCommand()
    {
    }

}