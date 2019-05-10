public class driverCont{
    public  Joystick joyLeft = new Joystick(0);
     public Joystick joyRight = new Joystick(1);

     public Button A = new JoyStickButton(1);
     public Button B = new JoyStickButton(2);
    public  Button X = new JoyStickButton(3);
    public  Button Y = new JoyStickButton (4);
     public Button LB = new JoyStickButton (5);
    public Button RB = new JoyStickButton(6);

     boolean valRB, valLB, valA, valB, valY , valX; 
     double joyLeftValX, joyRightValX,joyLeftValY,joyRightValY;

 public driverCont(){     
    double joyLeftValX = joyLeft.get.getX();
    double joyRightValX = joyRight.getX();
    double joyLeftValY = joyRight.getY();
    double joyRightValY = joyRight.getY();

    boolean valRB = RB.getTop();
    boolean valLB = LB.getTop();
    boolean valA = A.getTop();
    boolean valB = B.getTop();
    boolean valX = Y.getTop();
    boolean valY = X.getTop();
    

 }


 