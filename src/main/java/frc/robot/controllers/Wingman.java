package frc.robot.controllers;

import edu.wpi.first.wpilibj.Joystick;
import frc.robot.Map;

public class Wingman {
    private static Joystick wingman;
    private boolean triggerToggle;
    private boolean triggerToggleStatus;
    private boolean thumbToggle;
    private boolean thumbToggleStatus;


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
        if(wingman.getRawButton(2)) {
            if(thumbToggle){
                thumbToggleStatus = !thumbToggleStatus;
                thumbToggle = true;
            }
        }else{
            thumbToggle = false;
        }
        
        return thumbToggle;

    }


    public boolean getTrigger(){
        // Trigger
        if(wingman.getRawButton(1)){
            if(!triggerToggle){
                triggerToggleStatus = !triggerToggleStatus;
                triggerToggle = true;
            }
        }else{
            triggerToggle = false;
        }

        return triggerToggle;
    }

    

        





    }