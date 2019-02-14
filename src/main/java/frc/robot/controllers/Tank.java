package frc.robot.controllers;

import frc.robot.controllers.Xbox;
import frc.robot.subsytem.Arm;
import frc.robot.subsytem.Chassis;
import frc.robot.subsytem.Elevator;

public class Tank {

    private static Chassis chassis;
    private static Xbox controller;
    private static Arm arm;
    private static Elevator elevator;

    public Tank(){
        controller = new Xbox();
        chassis = new Chassis();
        arm = new Arm();
        elevator = new Elevator();
    }


    public void Update(){
 
            
        if (controller.getXButton()) {
            chassis.right(controller.getLY()/2);
            chassis.left(controller.getRY()/2);
        } else {
             chassis.right(controller.getLY());
             chassis.left(controller.getRY());

        }

        if (controller.getLB()) {
            arm.open();
        }

        if (controller.getRB()) {
            arm.closed();
        }
    }
}
