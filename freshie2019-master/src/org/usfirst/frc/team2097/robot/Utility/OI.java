
package Utility;



public class OI{
       
        driverController = new driverCont(0, 0.11, 0.11);
        operatorController = new opCont(1, 0.11, 0.11);

    public OI(){     

       driverController.joyLeft.whileHld(new RunJankBase());
       driverController.joyRight.whileHled(new RunJankBase());
       //Hopefully these run the robot

       driverController.A.whenPressed(new RunShift());
       //this should run the shifter

    }


 


    

}