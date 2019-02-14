package frc.robot.subsytem;


import edu.wpi.first.wpilibj.PWMVictorSPX;
import frc.robot.Map;

public class Elevator{
    private static PWMVictorSPX lift;

    public Elevator () {
        lift = new PWMVictorSPX(6);
    }

    public void lift(double speed){
        lift.set(speed);
    }

}