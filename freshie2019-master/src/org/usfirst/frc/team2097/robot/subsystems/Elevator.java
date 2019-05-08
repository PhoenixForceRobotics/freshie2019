package org.usfirst.frc.team2097.robot.subsystems;

import frc.team2097.robot.Conststants;

import com.revrobotics.CANSparkMaxLowLevel.MotorType;

public class Elevator extends Subsystems
{
    //creating some names for the motor
    private Motor elevator1, elevator2;

    public Elevator()
    {
        elevator1 = new Motor(Conststants.MotorMap.Elevator.ELEVATOR1, MotorType.kbrushed, Conststants.MotorMap.Elevator.ELEVATOR1_REVERSED);
        elevator2 = new Motor(Conststants.MotorMap.Elevator.ELEVATOR2, MotorType.kbrushed, Conststants.MotorMap.Elevator.ELEVATOR2_REVERSED);
    
        elevator2.follow(elevator1);
    }
}