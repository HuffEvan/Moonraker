package frc.robot.controllers;

// The reason this wont build is because were idiots and dont know how to spell
// import frc.robot.subsytem.Chassis; Is the correct spelling but we call it subsytem
import frc.robot.subsytem.Chassis;
import frc.robot.controllers.Xbox;
import frc.robot.subsytem.Arm;
import frc.robot.subsytem.Elevator;

public class Arcade{
    private static Xbox controller;
    private static Chassis chassis;
    private static Arm arm;
    private static Elevator elevator;

    private static double leftInput;
    private static double leftOutput;

    private static double rightInput;
    private static double rightOutput;


    public Arcade(){
        controller = new Xbox();
        chassis = new Chassis();
        arm = new Arm();
        elevator = new Elevator();

        leftInput = 0;
        leftOutput = 0;

        rightInput = 0;
        rightOutput = 0;
    }


    public void Update(){

        if (controller.getXButton()) {
            chassis.right((controller.getLX() - -controller.getLY())/2);
            chassis.left((controller.getLX() + -controller.getLY())/2);
        } else {
            chassis.right((controller.getLX() - -controller.getLY()));
            chassis.left((controller.getLX() + -controller.getLY()));
        }
        
        if (controller.getLB()) {
            arm.open();
        }

        if (controller.getRB()) {
            arm.closed();
        }

        if (controller.getAButton()) {
            elevator.lift(.5);
        } else if (controller.getBButton()) {
            elevator.lift(-.8);
        } else {
            elevator.lift(0);
        }
    }
}