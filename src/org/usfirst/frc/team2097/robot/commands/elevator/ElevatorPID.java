package org.usfirst.frc.team2097.robot.commands.elevator;

import frc.team2097.robot.Conststants;
import edu.wpi.first.wpilibj.command.PIDCommand;
import com.revrobotics.CANEncoder;

public class ElevatorPID extends PIDCommand 
{
    private Elevator elevator;
    private CANEncoder encoder;

    public ElevatorPID()
    {
        super(0.0, 0.0, 0.0);
        requires(elevator);
        this.elevator = elevator;
        this.encoder = robot.subsystem.elevator;
    }
 
    @Override
    public returnPIDInput()
    {
        return elevator.encoderElevatorValue();
    }

    @Override
    public usePIDOutput(double output)
    {
        return elevatorEncoder.setPosition();
    }

    public PIDUp(double setpoint) 
    {

    }

    @Override
    protected boolean isFinished()
    {
        return false;
    }

    @Override
    protected void end()
    {

    }
}