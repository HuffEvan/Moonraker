package frc.robot.subsytem;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Spark;

public class Arm{
    private static Solenoid actuator;
    private static Solenoid actuator1;
    private static Spark axis;

    public Arm () {
        actuator = new Solenoid(6);
        actuator1 = new Solenoid(1);
    }

    public void open (){

        actuator.set(true);
        actuator1.set(false);

    } 
    public void closed (){

        actuator.set(false);
        actuator1.set(true);
    }

   

}


