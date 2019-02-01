// package frc.robot.controllers;

// import frc.robot.subsystem.Chassis;
// import frc.robot.controllers.Xbox;

// public class Arcade{
//     private static Xbox controller;
//     private static Chassis chassis;

//     public Arcade(){
//         controller = new Xbox();
//         chassis = new Chassis();
//     }


//     private static void Update(){
//         chassis.left(controller.getLY() - controller.getLX());
//         chassis.right(controller.getLY() + controller.getLX());
//     }
// }