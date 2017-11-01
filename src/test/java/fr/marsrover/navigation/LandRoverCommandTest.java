package fr.marsrover.navigation;

import fr.marsrover.geolocation.Coordinate;
import fr.marsrover.geolocation.Location;
import fr.marsrover.geolocation.Orientation;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LandRoverCommandTest {
  @Test
  public void should_accept_location_object() throws Exception {
    LandRoverCommand landRoverCommand = new LandRoverCommand(new Location(new Coordinate(23, 42), new Orientation(Compass.NORTH)));
    assertThat(landRoverCommand.getXCoordinate()).isEqualTo(23);
    assertThat(landRoverCommand.getYCoordinate()).isEqualTo(42);
    assertThat(landRoverCommand.getCompass()).isEqualTo(Compass.NORTH);
  }
}
