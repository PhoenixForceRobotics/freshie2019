package org.usfirst.frc.team2097.robot;

public class Constants {

    public static class MotorMap {

            public static class Drivebase{
            public static int DBTL1 = 1;
            public static int DBTL2 = 2;
            public static int DBTL3 = 3;
            //DRIVEBASE LEFT MOTORS

            public static int DBTR1 = 12;
            public static int DBTR2 = 13;
            public static int DBTR3 =14;
            //DRIVEBASE RIGHT MOTORS

            public static final boolean DBTL1_REVERSE = false;
            public static final boolean DBTL2_REVERSE = false;
            public static final boolean DBTL3_REVERSE = false;
            //LEFT

            public static final boolean DBTR1_REVERSE = true;
            public static final boolean DBTR2_REVERSE = true;
            public static final boolean DBTR3_REVERSE = true;
            //RIGHT

        }

        public static class HDrive{

            public static int HD1 = 15;
            public static int HD2 = 16;
            //HDRIVE MOTORS

            public static final boolean HD1_REVERSE = false;
            public static final boolean HD2_REVERSE = true;

        }

        public static class Elevator{
            //Elevator
            public static int ELEVATOR1 = 10;
            public static int ELEVATOR2 = 11;

            public static final boolean ELEVATOR1_REVERSE = true;
            public static final boolean ELEVATOR2_REVERSE = true;

        }
        
        public static class BallCollector
        {
            //COLLECTOR_ARM_ROTATOR rotats the arm that the collector is on if that makes sense
            //COLLECTOR_IN_OUT means intake outake but its action is called suck and kashoot  in the code, dont get confused
            public static int COLLECTOR_ARM_ROTATER = 4;
            public static int COLLECTOR_ARM_ROTATER1 = 6;
            public static int COLLECTOR_IN_OUT = 7;

            public static final boolean COLLECTOR_ARN_ROTATER_REVERSED = true;
            public static final boolean COLLECTOR_ARM_ROTATER1_REVERSED = false;
            public static final boolean COLLECTOR_IN_OUT_REVERSED = true;

        }

        public static class Numbers 
        {

            double scalerOne = .8 ;
            //moving on from drivebase
            //written by big Chungus

            double scalerTwo = .5 ;
            //this is the one for the HDrive, I took the easy way out
            //written by Andrew

            double scalerThree = .4 ;
            // double is the type
            // scalerThree is the name (written by Andrew)

        }
    }
}