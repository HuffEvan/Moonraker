package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import frc.robot.controllers.Wingman;
import frc.robot.controllers.Xbox;
import frc.robot.subsytem.Arm;
import frc.robot.subsytem.Chassis;
import frc.robot.subsytem.Elevator;


public class Robot extends TimedRobot {

  private static final Chassis chassis = new Chassis(); 
  private static final Wingman driver = new Wingman();
  private static final Elevator elevator = new Elevator();
  private static final Xbox coDriver = new Xbox();
  private static final Arm arm = new Arm(); 
  private static final Elevator lift = new Elevator();

  @Override
  public void robotInit() {
  }


  @Override
  public void robotPeriodic() {
  }


  @Override
  public void autonomousInit() {
  }

  @Override
  public void autonomousPeriodic() {
    elevator.lift(driver.getY());
  }


  @Override
  public void teleopPeriodic() {
    chassis.left(driver.getY());
    chassis.right(driver.getY());

    if (driver.getThumb() == true) {
      arm.open();
    } else {
      arm.closed();   
    }
  
  
    if (coDriver.getRB() == true) {
      lift.up();
    } else {
      lift.down();
    }
    
  }
  

  
  @Override
  public void testPeriodic() {
  }
}


