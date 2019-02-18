/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.subsystems.Pneumatic_subsystem;

/**
 * Add your docs here.
 */
public class LetGo_command extends Command{
    public LetGo_command() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.Pneumatics);
      }
    
      private void requires(Pneumatic_subsystem pneumatics) {
	}

	// Called just before this Command runs the first time
      @Override
      protected void initialize() {
      }
    
    
      // Called repeatedly when this Command is scheduled to run
      @Override
      protected void execute() {
        if (Robot.m_oi.RemoteButtons2()) {
          Robot.Pneumatics.out();
    
        } else {
          Robot.Pneumatics.in();
        }
      }
    
      // Make this return true when this Command no longer needs to run execute()
      @Override
      protected boolean isFinished() {
        return false;
      }
    
      // Called once after isFinished returns true
      @Override
      protected void end() {
        Robot.Pneumatics.in();
      }
    
      // Called when another command which requires one or more of the same
      // subsystems is scheduled to run
      @Override
      protected void interrupted() {
        end();
      }
    }
    

