
package org.usfirst.frc.team2097.robot.subsystems;

import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team2097.robot.Constants;
import org.usfirst.frc.team2097.robot.subsystems.Utility.Motor;

public class SpeedShifter extends Subsystem {
    public int slow;
    public int full; 

        public SpeedShifter(){

            
            


        }

	    public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}
}
