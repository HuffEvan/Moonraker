package frc.robot.controllers;

import frc.robot.controllers.Xbox;
import frc.robot.subsytem.Chassis;

public class Tank {

    private static Chassis chassis;
    private static Xbox controller;

    public Tank(){
        chassis = new Chassis();
    }

    public void Update(){
        System.out.println("Updating");
    }

}
