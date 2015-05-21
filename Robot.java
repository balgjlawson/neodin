package org.usfirst.frc.team2928.robot;


import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.RobotDrive.MotorType;
import edu.wpi.first.wpilibj.SampleRobot;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.buttons.JoystickButton;


public class Robot extends SampleRobot {
	private Drive odin;
	private Pickup p;
	
	private Joystick stick = new Joystick(1);
	private JoystickButton shift;
	private JoystickButton pickupButton;
	private JoystickButton rollerButton;
	private JoystickButton shooterButton;
	
	

	
	private Solenoid leftA = new Solenoid(1);
	private Solenoid leftB = new Solenoid(2);
	private Solenoid rightA = new Solenoid(3);
	private Solenoid rightB= new Solenoid(4);
	private Solenoid pickupA = new Solenoid(5);
	private Solenoid pickupB = new Solenoid(6);
	
	private Talon left = new Talon(1);
	private Talon right = new Talon(2);
	private Talon shoot = new Talon(3);
	private Talon pickup = new Talon(4);
	


    public Robot() {
    	odin = new Drive(left, left, left, left, stick);
    	p = new Pickup(pickupA, pickupB, pickup);
    
    }
        public void autonomous(){
        	
        }

 
    public void operatorControl() {
    	
    	odin.go();
      
        }
    }
    



