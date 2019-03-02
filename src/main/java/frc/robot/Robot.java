package frc.robot;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.TimedRobot;
import frc.robot.controllers.Tank;
import frc.robot.subsytem.Camera;
import frc.robot.controllers.Arcade;

public class Robot extends TimedRobot {

  private static Tank Driver;
  private static Arcade coDriver;
  private static Compressor compressor;
  private static Camera camera;

  @Override
  public void robotInit() {
    Driver = new Tank();
    coDriver = new Arcade();
    camera = new Camera();
    compressor = new Compressor();
  }


  @Override
  public void robotPeriodic() {

    compressor.setClosedLoopControl(true);
    // camera.Run();

  }


  @Override
  public void autonomousInit() {
  }

  @Override
  public void autonomousPeriodic() {
    coDriver.Update();
  }


  @Override
  public void teleopPeriodic() {
    Driver.Update();    
    coDriver.Update();
  }
  

  
  @Override
  public void testPeriodic() {
  }
}


