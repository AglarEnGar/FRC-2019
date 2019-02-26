/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.SendableBase;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import frc.robot.RobotMap;
import frc.robot.commands.LetGo_command;



/**
 * Add your docs here.
 */
public class Pneumatic_subsystem extends Subsystem {
    //Piston piston = new Piston;
    public DoubleSolenoid Piston1 = new DoubleSolenoid(RobotMap.forwardSolenoid, RobotMap.reverseSolenoid);
    

    public void initDefaultCommand() {
        
        setDefaultCommand(new LetGo_command());
        
    }

    public Pneumatic_subsystem() {
     

    }

    public void out() {
       
        Piston1.set(DoubleSolenoid.Value.kForward);

    }
    public void in() {
      
        Piston1.set(DoubleSolenoid.Value.kReverse);
        
    }


    
}
