package fr.marsrover.navigation;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LandRoverTest {
  @Test
  public void should_be_instantiable() throws Exception {
    // When
    LandRover landRover = new LandRover(0);
    // Then
    assertThat(landRover).isNotNull();
  }

  @Test
  public void should_have_a_x_coordinate_when_initializing_with_x_coordinate() throws Exception {
    LandRover landRover = new LandRover(23);
    assertThat(landRover.getXCoordinate()).isEqualTo(23);
  }
}
