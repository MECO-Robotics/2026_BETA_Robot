package frc.robot.subsystems.flywheel;

public class FlywheelConstants {
  public record FlywheelGains(
      double kP,
      double kI,
      double kD,
      double kS,
      double kV,
      double kA,
      double kMaxAccel,
      double kTolerance) {}

  public record FlywheelHardwareConfig(
      int[] canIds, boolean[] reversed, double gearRatio, int currentLimit, String canBus) {}

  public static final FlywheelHardwareConfig EXAMPLE_CONFIG =
      new FlywheelHardwareConfig(new int[] {1}, new boolean[] {true}, 2.0, 40, "");

  public static final FlywheelGains EXAMPLE_GAINS =
      new FlywheelGains(0.2, 0.0, 0.0, 0.0, 0.065, 0.0, 1.0, 1.0);

  // Intake
  public static final FlywheelHardwareConfig INTAKE_ROLLER_CONFIG =
      new FlywheelHardwareConfig(new int[] {3}, new boolean[] {false}, 1.0, 30, "");
  public static final FlywheelGains INTAKE_ROLLER_GAINS =
      new FlywheelGains(0.1, 0.0, 0.0, 0.0, 0.05, 0.0, 1.0, 1.0);
}
