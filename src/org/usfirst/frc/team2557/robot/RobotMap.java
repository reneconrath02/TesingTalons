/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team2557.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	
    public static WPI_TalonSRX driveLeft1;
    public static WPI_TalonSRX driveLeft2;
    public static WPI_TalonSRX driveRight1;
    public static WPI_TalonSRX driveRight2;
    
    public static WPI_TalonSRX talonZero;
    public static WPI_TalonSRX talonOne;
    public static WPI_TalonSRX talonTwo;
    public static WPI_TalonSRX talonThree;
    public static WPI_TalonSRX talonFour;
    public static WPI_TalonSRX talonFive;
    public static WPI_TalonSRX talonSix;
    public static WPI_TalonSRX talonSeven;
    public static WPI_TalonSRX talonEight;
    public static WPI_TalonSRX talonNine;
    public static WPI_TalonSRX talonTen;
    public static WPI_TalonSRX talonEleven;
    public static WPI_TalonSRX talonTwelve;
    public static WPI_TalonSRX talonThirteen;
    
    
    
    public static SpeedControllerGroup left;
    public static SpeedControllerGroup right;
    
    public static DifferentialDrive robotDrive;
    
    public static void init() { 
    	
	    driveLeft1 = new WPI_TalonSRX(5);
	    driveLeft2 = new WPI_TalonSRX(8);
	    driveRight1 = new WPI_TalonSRX(6);
	    driveRight2 = new WPI_TalonSRX(7);
	    
//	    talonZero = new WPI_TalonSRX(0);
//	    talonOne = new WPI_TalonSRX(1);
//	    talonTwo = new WPI_TalonSRX(2);
//	    talonThree = new WPI_TalonSRX(3);
//	    talonFour = new WPI_TalonSRX(4);
	    
//	    talonFive = new WPI_TalonSRX(5);
//	    
//	    talonSix = new WPI_TalonSRX(6);
//	    talonSeven = new WPI_TalonSRX(7);
//	    talonEight = new WPI_TalonSRX(8);
//	    talonNine = new WPI_TalonSRX(9);
//	    talonTen = new WPI_TalonSRX(10);
//	    talonEleven = new WPI_TalonSRX(11);
//	    talonTwelve = new WPI_TalonSRX(12);
//	    talonThirteen = new WPI_TalonSRX(13);
	    
	    driveLeft1.setInverted(true);
	    driveLeft2.setInverted(true);
	    driveRight1.setInverted(true);
	    driveRight2.setInverted(true);
	    
	    left = new SpeedControllerGroup(driveLeft1, driveLeft2);
	    right = new SpeedControllerGroup(driveRight1, driveRight2);
	    
	    robotDrive = new DifferentialDrive(left, right);
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
    }
}
