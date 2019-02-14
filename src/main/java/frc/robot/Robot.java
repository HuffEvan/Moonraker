package frc.robot;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.TimedRobot;
import frc.robot.controllers.Tank;
import frc.robot.controllers.Arcade;
import frc.robot.subsytem.Camera;

public class Robot extends TimedRobot {

  private static Arcade coDriver;
  private static Compressor compressor;
  private static Camera camera;

  @Override
  public void robotInit() {
    coDriver = new Arcade();
    // camera = new Camera();
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
  }


  @Override
  public void teleopPeriodic() {    
    coDriver.Update();
  }
  

  
  @Override
  public void testPeriodic() {
  }
}


