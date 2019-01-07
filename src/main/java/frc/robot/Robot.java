package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import frc.robot.controllers.Wingman;
import frc.robot.subsytem.Chassis;


public class Robot extends TimedRobot {

  private static final Chassis chassis = new Chassis(); 
  private static final Wingman driver = new Wingman();

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
    chassis.left(0.3);
    chassis.right(0.3);
  }


  @Override
  public void teleopPeriodic() {
    chassis.left(driver.getY());
    chassis.right(driver.getY());
  }

  
  @Override
  public void testPeriodic() {
  }
}
