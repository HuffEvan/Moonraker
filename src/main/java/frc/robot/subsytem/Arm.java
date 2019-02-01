package frc.robot.subsytem;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Spark;

public class Arm{
    private static Solenoid actuator;
    private static Spark axis;
    private static Map oi;

    public Arm () {
        oi = new Map();
        actuator = new Solenoid(oi.ArmActuator);
        axis = new Spark(oi.ArmAxis);
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


