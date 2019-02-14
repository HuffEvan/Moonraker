package frc.robot.controllers;

import edu.wpi.first.wpilibj.Joystick;

public class Xbox {
    private static Joystick Xbox;
    
    public Xbox(){
        Xbox = new Joystick(1);
    }

    public double getLX(){
        // X Axis Left
        return Xbox.getRawAxis(0);
    }
    
    public double getLY(){
        // Y Axis Left
        return Xbox.getRawAxis(1);
    }

    public double getRX(){
        // X Axis Right
        return Xbox.getRawAxis(4);
    }
    
    public double getRY(){
        // Thumb Button
        return Xbox.getRawAxis(5);
    }

    public double getLT(){
        // Left Trigger
        return Xbox.getRawAxis(2);
    }

    public double getRT(){
        // Right Trigger
        return Xbox.getRawAxis(3);
    }

    public boolean getLB(){
        // Left Button
        return Xbox.getRawButton(5);
    }

    public boolean getRB(){
        // Right Button
        return Xbox.getRawButton(6);
    }

    public boolean getYButton(){
        // Y Botton
        return Xbox.getRawButton(4);
    }

    public boolean getXButton(){
        // X Button
        return Xbox.getRawButton(3);
    }

    public boolean getAButton(){
        // A Button
        return Xbox.getRawButton(1);
    }

    public boolean getBButton(){
        // B Button
        return Xbox.getRawButton(2);
    }

    }








