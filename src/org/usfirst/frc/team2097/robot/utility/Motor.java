package org.usfirst.frc.team2097.robot.utility;

import com.revrobotics.CANSparkMaxLowLevel.MotorType;


public class Motor extends MonitorType {
    public Motor(int port, boolean reversed) {
        super(port);
        setInverted(reversed);
    }
}
