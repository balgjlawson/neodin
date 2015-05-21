package org.usfirst.frc.team2928.robot;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Talon;

public class Pickup {
	Solenoid inSolenoid;
	Solenoid outSolenoid;
	Talon pickupMotor;

	


	public Pickup(Solenoid pickupA, Solenoid pickupB, Talon pickup) {
		// TODO Auto-generated constructor stub
		inSolenoid = pickupA;
		outSolenoid = pickupB;
		pickupMotor = pickup;
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
