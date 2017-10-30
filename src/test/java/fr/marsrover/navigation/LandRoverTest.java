package fr.marsrover.navigation;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LandRoverTest {
  @Test
  public void should_be_instantiable() throws Exception {
    // When
    LandRover landRover = new LandRover();
    // Then
    assertThat(landRover).isNotNull();
  }
}
