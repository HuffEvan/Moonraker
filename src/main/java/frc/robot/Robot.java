package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import frc.robot.controllers.Tank;
import frc.robot.controllers.Arcade;

public class Robot extends TimedRobot {

  private static Tank driver;
  private static Arcade coDriver;

  @Override
  public void robotInit() {
    driver = new Tank();
    coDriver = new Arcade();
  }


  @Override
  public void robotPeriodic() {
  }


  @Override
  public void autonomousInit() {
  }

  @Override
  public void autonomousPeriodic() {
  }


  @Override
  public void teleopPeriodic() {    
    driver.Update();
    coDriver.Update();
  }
  

  
  @Override
  public void testPeriodic() {
  }
}


