package frc.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import frc.robot.subsytem.Chassis;


public class Robot extends IterativeRobot {

  private static final Chassis chassis = new Chassis(); 

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
    chassis.right(1);
  }


  @Override
  public void teleopPeriodic() {
  }

  
  @Override
  public void testPeriodic() {
  }
}
