package org.usfirst.frc.team2557.robot.subsystems;

import org.usfirst.frc.team2557.robot.OI;
import org.usfirst.frc.team2557.robot.RobotMap;
import org.usfirst.frc.team2557.robot.commands.SomethingOnFiveCommand;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class SomethingOnFiveSubsystem extends Subsystem {
	
    public void MovingFive(){
//    		RobotMap.talonZero.set(1);
//    		RobotMap.talonOne.set(1);
//    		RobotMap.talonTwo.set(1);
//    		RobotMap.talonThree.set(1);
//    		RobotMap.talonFour.set(1);
//    		RobotMap.talonTwelve.set(1);
//    		RobotMap.talonThirteen.set(1);
//    		RobotMap.talonSix.set(1);
//    		RobotMap.talonFive.set(1);
////    		RobotMap.talonSeven.set(1);
//    		RobotMap.talonEight.set(1);
//    		RobotMap.talonNine.set(1);
//    		RobotMap.talonTen.set(1);
//    		RobotMap.talonEleven.set(1);
//    		RobotMap.talonTwelve.set(1);
//    		RobotMap.talonThirteen.set(1);
    }

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new SomethingOnFiveCommand());
    }
}

