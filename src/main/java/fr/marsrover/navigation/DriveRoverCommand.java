package fr.marsrover.navigation;

public class DriveRoverCommand {
  private DrivingInstruction drivingInstruction;

  public DriveRoverCommand(DrivingInstruction drivingInstruction) {
    this.drivingInstruction = drivingInstruction;
  }

  public DrivingInstruction getInstruction() {
    return drivingInstruction;
  }
}
