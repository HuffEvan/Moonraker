package frc.robot.controllers;

import frc.robot.subsytem.Arm;
import frc.robot.subsytem.Chassis;
import frc.robot.subsytem.Elevator;

public class Tank {

    private static Chassis chassis;
    private static Wingman controller;
    private static Arm arm;
    private static Elevator elevator;

    public Tank(){
        controller = new Wingman();
        chassis = new Chassis();
    }


    public void Update(){
        if (controller.getThumb()) {
            System.out.println("CHASSIS LEFT = " + (controller.getY() + controller.getX())/2);
            System.out.println("CHASSIS RIGHT = " + (controller.getY() - controller.getX())/2);
            
            chassis.left((controller.getX() + controller.getY())/2);
            chassis.right((controller.getX() - controller.getY())/2);
            
        } else {
            System.out.println("CHASSIS LEFT = " + (controller.getY() + controller.getX()));
            System.out.println("CHASSIS RIGHT = " + (controller.getY() - controller.getX()));

            chassis.left((controller.getX() + controller.getY()));
            chassis.right((controller.getX() - controller.getY()));
        }
        
    }
}
