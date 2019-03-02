/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.TankDrive_Command;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class DriveTrain_subsystem extends Subsystem {
  VictorSPX LeftVictor1 = new VictorSPX(1);
  VictorSPX LeftVictor2 = new VictorSPX(2);
  VictorSPX RightVictor1 = new VictorSPX(3);
  VictorSPX RightVictor2 = new VictorSPX(4);

public DriveTrain_subsystem() {
  LeftVictor2.follow(LeftVictor1)
  RightVictor2.follow(RightVictor1);

}
 

 
  // Put methods for controlling this subsystem
  // here. Coall these from Commands.

  @Override
  public void initDefaultCommand() {
    setDefaultCommand(new TankDrive_Command());
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
  public void TeleopDrive(double left, double right) {
    LeftVictor1.set(ControlMode.PercentOutput, -left);
    RightVictor1.set(ControlMode.PercentOutput, -right);

  }
  public void Stop(){
    LeftVictor1.set(ControlMode.PercentOutput, 0);
    RightVictor1.set(ControlMode.PercentOutput, 0);
  }
}
