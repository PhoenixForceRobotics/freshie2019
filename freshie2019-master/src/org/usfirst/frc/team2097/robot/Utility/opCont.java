public class opCont{
    public  Joystick joyLeft = new Joystick(0);
     public Joystick joyRight = new Joystick(1);

     public Button OpA = new JoyStickButton(1);
     public Button OpB = new JoyStickButton(2);
    public  Button OpX = new JoyStickButton(3);
    public  Button OpY = new JoyStickButton (4);
     public Button OpLB = new JoyStickButton (5);
    public Button OpRB = new JoyStickButton(6);

     boolean valRB, valLB, valA, valB, valY , valX; 
     double joyLeftValX, joyRightValX,joyLeftValY,joyRightValY;

 public opCont(){     

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
 }

