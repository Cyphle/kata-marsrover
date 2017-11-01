package fr.marsrover.navigation;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LandRoverCommandTest {
  @Test
  public void should_be_able_to_initialize_with_coordinates_and_orientation() throws Exception {
    LandRoverCommand landRoverCommand = new LandRoverCommand(new Coordinate(23, 42), new Orientation(Compass.NORTH));
    assertThat(landRoverCommand.getXCoordinate()).isEqualTo(23);
    assertThat(landRoverCommand.getYCoordinate()).isEqualTo(42);
    assertThat(landRoverCommand.getCompass()).isEqualTo(Compass.NORTH);
  }
}
