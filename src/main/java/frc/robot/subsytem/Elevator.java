package frc.robot.subsytem;


import edu.wpi.first.wpilibj.Spark;

public class Elevator{
    private static Spark lift;
    

    public Elevator () {
        lift = new Spark(5);
    }

    public void lift(double speed){
        lift.set(speed);
    }

    public void up (){
        lift.set(1);
    }

    public void down (){
        lift.set(-1);
    }

}