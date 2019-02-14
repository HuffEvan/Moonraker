package frc.robot.subsytem;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import frc.robot.Map;

public class Arm{
    private static DoubleSolenoid actuator;
    private static Spark axis;

    public Arm () {
        actuator = new DoubleSolenoid(0, 1);
        axis = new Spark(5);
    }

    public void open (){

        actuator.set(DoubleSolenoid.Value.kOff);

    } 
    public void closed (){

        actuator.set(DoubleSolenoid.Value.kReverse);
    }

   

}


