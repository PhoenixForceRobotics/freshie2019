package org.usfirst.frc.team2097.robot.subsystems;

import org.usfirst.frc.team2097.robot.Constants;
import org.usfirst.frc.team2097.robot.subsystems.Utility.Motor;

import com.revrobotics.CANSparkMaxLowLevel.MotorType;

public class BallCollector extends Subsystems
{
        private Motor ballcollector;

        public collect()
        {
            ball_collector = new Motor(Constants.MotorMap.BallCollector.COLLECTER_IN_OUT, kbrushless, Constants.MotorMap.BallCollector.COLLECTER_IN_OUT_REVERSED);
        }

        public void suck(double value)
        {
            suck.set(-speed);
        }

        public void kashoot(double value)
        {
            kashoot.set(speed);
        }

}
