package frc.robot.subsytem;


import edu.wpi.first.wpilibj.Spark;

public class Elevator{
    private static Spark lift;
    private static Map oi;
    oi = new Map();

    public Elevator () {
        lift = new Spark(oi.lift);
    }

    public void lift(double speed){
        lift.set(speed);
    }

    public void up (){
        lift.set(1/2);
    }

    public void down (){
        lift.set(-1/2);
    }

}