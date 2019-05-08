import frc.team2097.controller.BobXboxController;


public class OI{


        BobXboxController driverController = new BobXboxController(0,0.11,0.11);
        BobXboxController evnController = new BobXboxController(1,0.11,0.11);
                        //Evan is the coolest freshman


    public OI(){

            driverController.leftTrigger.whileheld(new runHDrive());
            driverController.rightTrigger.whileheld(new runHDrive());
            // Runs the HDrive, or the side to side wheels.

            driverController.rightStick.whileheld(new RunJankBase());
            driverController.rightStick.whileheld(new RunJankBase());
            //These run the drivebase, and they are the sticks on the top of the controller

            //driverController.yButton.whenpressed(new RunShifter());
            //driverController.bButton.whenpressed(new runShifter());
            //I am not using these anymore,,

            driverController.rightStickButton.whenpressed(new runShifter());
            //this is the one to run the shifter

            driverController.leftTriggerButton.whileheld(new slowHDrive());
            driverController.RightTreggerButton.whileheld(new slowHDrive());
            //This is a code I plan to write to make the HDrive run slower.



       




    }


}