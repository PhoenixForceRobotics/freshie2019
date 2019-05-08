package org.usfirst.frc.team2097.robot.subsystems;

import frc.team2097.robot.Conststants;

import com.revrobotics.CANSparkMaxLowLevel.MotorType;

public class Elevator extends Subsystems
{
    //creating some names for the motor
    private Motor elevator1, elevator2;

    public Elevator()
    {
        elevator1 = new Motor(Conststants.MotorMap.Elevator.ELEVATOR1, kbrushed, Conststants.MotorMap.Elevator.ElEVATOR1_REVERSED);
        //ANDREW HAS A QUESTION-----------------------------------------------------------------------------------Why does this say reversed, when in the constants, it says REVERSE, not REVERSED?
    }
}