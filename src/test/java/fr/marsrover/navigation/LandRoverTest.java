package fr.marsrover.navigation;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LandRoverTest {
  @Test
  public void should_be_able_to_initialize_with_coordinates_and_orientation() throws Exception {
    LandRover landRover = new LandRover(new Coordinate(23, 42), Orientation.NORTH);
    assertThat(landRover.getXCoordinate()).isEqualTo(23);
    assertThat(landRover.getYCoordinate()).isEqualTo(42);
    assertThat(landRover.getOrientation()).isEqualTo(Orientation.NORTH);
  }
}
