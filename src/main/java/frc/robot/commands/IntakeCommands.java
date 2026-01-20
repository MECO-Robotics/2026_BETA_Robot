package frc.robot.commands;

import edu.wpi.first.math.util.Units;
import frc.robot.util.mechanical_advantage.LoggedTunableNumber;

public class IntakeCommands {

  // ---------------------
  // Intake Rotation Presets
  // ---------------------
  public static final class Rotation_POSITIONS {
    public static final LoggedTunableNumber DEPLOY =
        new LoggedTunableNumber("IntakeRotation/DEPLOY", Units.degreesToRadians(0));
    public static final LoggedTunableNumber STOW =
        new LoggedTunableNumber("IntakeRotation/STOW", Units.degreesToRadians(0));
  }

  // ---------------------
  // Intake Volts
  // ---------------------
  public final class ROLLER_VOLTS {
    public static final LoggedTunableNumber Intake = new LoggedTunableNumber("IntakeSpeed", 0.0);
    public static final LoggedTunableNumber Outtake = new LoggedTunableNumber("OuttakeSpeed", 0.0);
  }
}
