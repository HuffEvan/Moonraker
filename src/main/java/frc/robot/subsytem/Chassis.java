package frc.robot.subsytem;

import edu.wpi.first.wpilibj.PWMVictorSPX;
import frc.robot.utility.Stick;

public class Chassis {

    private static Stick stick;

    private static final int LEVEL = 0;
    private static final String TAG = "CHASSIS";

    private static PWMVictorSPX leftMaster;
    private static PWMVictorSPX leftSlave;
    private static PWMVictorSPX rightMaster;
    private static PWMVictorSPX rightSlave;


    public Chassis() {
        stick = new Stick();

        leftMaster = new PWMVictorSPX(0);
        leftSlave = new PWMVictorSPX(1);
        rightMaster = new PWMVictorSPX(2);
        rightSlave = new PWMVictorSPX(3);

        stick.print(TAG, "Initalization complete", LEVEL);
        
    }

    public void left(double speed) {
        leftMaster.set(speed);
        leftSlave.set(speed);

        stick.print(TAG, speed, LEVEL);
    }

    public void right(double speed) {
        rightMaster.set(speed);
        rightSlave.set(speed);

        stick.print(TAG, speed, LEVEL);
    }

    public void setLeftMaster(double speed){
        leftMaster.set(speed);

        stick.print(TAG, speed, LEVEL);
    }

    public void setLeftSlave(double speed){
        leftSlave.set(speed);

        stick.print(TAG, speed, LEVEL);
    }

    public void setRightMaster(double speed){
        rightSlave.set(speed);

        stick.print(TAG, speed, LEVEL);
    }

    public void setRightSlave(double speed){
        rightSlave.set(speed);

        stick.print(TAG, speed, LEVEL);
    }


}