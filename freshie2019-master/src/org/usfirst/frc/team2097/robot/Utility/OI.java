


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
        double joyLeftValX, joyRightValX,joyLeftValY,joyRightValY;

    public OI(){     

       

    }


    public controllMe(){

        double joyLeftValX = joyLeft.get.getX();
        double joyRightValX = joyRight.getX();
        double joyLeftValY = joyRight.getY();
        double joyRightValY = joyRight.getY();


    }

}