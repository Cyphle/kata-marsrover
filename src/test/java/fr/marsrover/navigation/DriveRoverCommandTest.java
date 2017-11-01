package fr.marsrover.navigation;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DriveRoverCommandTest {
  @Test
  public void should_be_instantiable() throws Exception {
    DriveRoverCommand driveRoverCommand = new DriveRoverCommand(DrivingInstruction.MOVE_FORWARD);
    assertThat(driveRoverCommand).isNotNull();
  }
}
