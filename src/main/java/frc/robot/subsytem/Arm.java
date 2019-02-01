package frc.robot.subsytem;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Spark;
import frc.robot.Map;

public class Arm{
    private static Solenoid actuator;
    private static Spark axis;

    public Arm () {
        actuator = new Solenoid(0);
        axis = new Spark(5);
    }

    public void open (){

        actuator.set(true);

    } 
    public void closed (){

        actuator.set(false);
    }

    public void up (){
        axis.set(1);
    }

    public void down (){
        axis.set(-1);
    }

}


