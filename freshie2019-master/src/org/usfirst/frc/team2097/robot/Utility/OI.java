


public class OI{
        Joystick joyLeft = new Joystick(0);
        Joystick joyRight = new Joystick(1);

        Button A = new Button(1);
        Button B = new Button(2);
        Button X = new Button(3);
        Button Y = new Button (4);
        Button LB = new Button (5);
        Button RB = new Button(6);

        boolean valRB, valLB, valA, valB, valY , valX; 
        double joyLeftVal, joyRightVal;

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


    public controllMe(){




    }

}