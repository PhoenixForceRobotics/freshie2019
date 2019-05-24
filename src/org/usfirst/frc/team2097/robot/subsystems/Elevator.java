package org.usfirst.frc.team2097.robot.subsystems;

import frc.team2097.robot.Constants;

import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import com.revrobotics.CANEncoder;

public class Elevator extends Subsystems
{
    //creating some names for the motor
    private Motor elevator1, elevator2;
    public CANEncoder elevatorencoder;

    public Elevator()
    {
        elevator1 = new Motor(Conststants.MotorMap.Elevator.ELEVATOR1, MotorType.kbrushed, Conststants.MotorMap.Elevator.ELEVATOR1_REVERSED);
        elevator2 = new Motor(Conststants.MotorMap.Elevator.ELEVATOR2, MotorType.kbrushed, Conststants.MotorMap.Elevator.ELEVATOR2_REVERSED);
    
        elevator2.follow(elevator1);
        elevatorEncoder = new Encoder(elevator1);
    }
    
    public setElevator()
    {
        elevator1.set(mode, value);
    }

    public encoderElevatorValue()
    {
        elevatorEncoder.getPosition();
    }

    public void initDefaultCommand()
    {
        
    }

}