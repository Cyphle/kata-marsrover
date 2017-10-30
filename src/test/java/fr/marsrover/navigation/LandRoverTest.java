package fr.marsrover.navigation;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LandRoverTest {
  @Test
  public void should_be_instantiable() throws Exception {
    // When
    LandRover landRover = new LandRover(0, 0, Orientation.NORTH);
    // Then
    assertThat(landRover).isNotNull();
  }

  @Test
  public void should_have_a_x_coordinate_when_initializing_with_x_coordinate() throws Exception {
    LandRover landRover = new LandRover(23, 0, Orientation.NORTH);
    assertThat(landRover.getXCoordinate()).isEqualTo(23);
  }

  @Test
  public void should_have_a_y_coordinate_when_initializing_with_y_coordinate() throws Exception {
    LandRover landRover = new LandRover(23, 42, Orientation.NORTH);
    assertThat(landRover.getYCoordinate()).isEqualTo(42);
  }

  @Test
  public void should_have_an_orientation_when_initializing_with_an_orientation() throws Exception {
    LandRover landRover = new LandRover(23, 42, Orientation.NORTH);
    assertThat(landRover.getOrientation()).isEqualTo(Orientation.NORTH);
  }
}
