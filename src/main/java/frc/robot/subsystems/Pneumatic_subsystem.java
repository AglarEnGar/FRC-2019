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
import frc.robot.commands.BoardInOut_Command;


/**
 * Add your docs here.
 */
public class Pneumatic_subsystem extends Subsystem {
    //Piston piston = new Piston;
    
    private DoubleSolenoid pneumatic;

    public Pneumatic_subsystem() {
        pneumatic  = new DoubleSolenoid(0, 2, 4);

    }

    public void out() {
        RobotMap.Piston1.set(DoubleSolenoid.Value.kForward);

    }
    public void in() {
        RobotMap.Piston1.pneumatic.set(DoubleSolenoid.Value.kReverse);
        
    }


    public void initDefaultCommand() {
        setDefaultCommand(new BoardInOut_Command());
        
    }
}
