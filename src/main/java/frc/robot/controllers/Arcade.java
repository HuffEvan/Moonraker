package frc.robot.controllers;

// The reason this wont build is because were idiots and dont know how to spell
// import frc.robot.subsytem.Chassis; Is the correct spelling but we call it subsytem
import frc.robot.subsytem.Chassis;
import frc.robot.controllers.Xbox;

public class Arcade{
    private static Xbox controller;
    private static Chassis chassis;

    public Arcade(){
        controller = new Xbox();
        chassis = new Chassis();
    }


    public void Update(){
        chassis.left(controller.getLY() - controller.getLX());
        chassis.right(controller.getLY() + controller.getLX());
    }
}