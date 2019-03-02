package frc.robot.subsytem;

import org.opencv.core.Mat;
import org.opencv.imgproc.Imgproc;

import edu.wpi.cscore.CvSink;
import edu.wpi.cscore.CvSource;
import edu.wpi.cscore.UsbCamera;
import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.IterativeRobot;

public class Camera  {
    UsbCamera camera;

    public Camera(){
        camera = CameraServer.getInstance().startAutomaticCapture();
        camera.setResolution(640, 480);
    }

    public void Run() {
            new Thread(() -> {                
                CvSink cvSink = CameraServer.getInstance().getVideo();
                CvSource outputStream = CameraServer.getInstance().putVideo("Blur", 640, 480);
            }).start();
    }
}