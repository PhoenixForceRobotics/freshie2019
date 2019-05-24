
package Utility;

import frc.robot.commands.RunJankBase;



public class OI{
       
        public driverCont driverController;
        // = new driverCont(0, 0.11, 0.11);
        public opCont operatorController;
        //public  = new opCont(1, 0.11, 0.11);

        

     OI(){    
         
        opController = new operatorController(1, 0.11, 0.11);
        driController = new driverCont(0, 0.11, 0.11);

       driverController.joyLeft.whileHld(new RunJankBase());
       driverController.joyRight.whileHled(new RunJankBase());
       //Hopefully these run the robot

       driverController.A.whenPressed(new RunShift());
       //this should run the shifter

    }
}


 


    

