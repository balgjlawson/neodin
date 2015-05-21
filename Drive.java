package org.usfirst.frc.team2928.robot;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;

public class Drive {

private Talon frontLeft; 
private Talon frontRight;
private Talon backLeft;
private Talon backRight;
Joystick driveJoy;
RobotDrive odin;


	public Drive(Talon t1, Talon t2, Talon t3, Talon t4, Joystick drive){
		frontLeft =	t1;
		frontRight = t2;
		backLeft = t3;
		backRight = t4;
		driveJoy = drive;
		odin = new RobotDrive(frontLeft,frontRight,backLeft, backRight );
		
	}
	
	public void go()
	{
		double pt1 = Math.pow(driveJoy.getX(), 3);
		double pt1y = Math.pow(driveJoy.getY(), 3);
		double pt2y =(4.0/5)*(pt1y);
		double pt2x = (4.0/5)*(pt1);
		double fixedX = 0;
		double fixedY = 0;
		if(driveJoy.getX()>.3)
		{
			fixedX = pt2x+.2;
		}
		
		if(driveJoy.getX()<-.2)
		{
			fixedX = pt2x-.2;
		}
		
		if(driveJoy.getY()>.3)
		{
			fixedY = pt2y+.2;
		}
		
		if(driveJoy.getY()<-.2)
		{
			fixedY= pt2y-.2;
		}
		odin.arcadeDrive(fixedX, fixedY);
	}
	
	public static void shift(Solenoid s1, Solenoid s2, Solenoid s3, Solenoid s4)
	{
			s1.set(!s1.get());
			s2.set(!s2.get());
			s3.set(!s3.get());
			s4.set(!s4.get());
	}
	
	
}
