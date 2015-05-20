package org.usfirst.frc.team2928.robot;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Talon;

public class Pickup {
	Solenoid inSolenoid;
	Solenoid outSolenoid;
	Talon pickupMotor;
	public Pickup(Solenoid s1, Solenoid s2, Talon t)
	{
		inSolenoid = s1;
		outSolenoid = s2;
		pickupMotor = t;
	}
	
	public void extend()
	{
		outSolenoid.set(true);
		inSolenoid.set(false);
	}
	public void retract()
	{
		outSolenoid.set(false);
		inSolenoid.set(true);
	}
	public void out()
	{
		pickupMotor.set(-1);
	}
	public void in()
	{
		pickupMotor.set(1);
	}
}

