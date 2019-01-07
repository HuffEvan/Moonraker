package frc.robot.controllers;

import edu.wpi.first.wpilibj.Joystick;

public class Wingman {
    private static Joystick wingman;
    
    public Wingman(){
        wingman = new Joystick(0);
    }

    public double getX(){
        // X Axis
        return wingman.getRawAxis(0);
    }
    
    public double getY(){
        // Y Axis
        return wingman.getRawAxis(1);
    }

    public double getZ(){
        // Z Axis
        return wingman.getRawAxis(2);
    }
    
    public boolean getThumb(){
        // Thumb Button
        return wingman.getRawButton(2);
    }

    public boolean getTrigger(){
        // Trigger
        return wingman.getRawButton(1);
    }

    

        





    }