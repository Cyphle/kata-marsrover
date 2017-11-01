package fr.marsrover.location;

import fr.marsrover.navigation.Compass;
import fr.marsrover.navigation.Coordinate;
import fr.marsrover.navigation.Orientation;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;

@RunWith(MockitoJUnitRunner.class)
public class LocateRoverHandlerTest {
  @Mock
  private LocationFinder locationFinder;

  @Test
  public void should_find_rover_latest_location() throws Exception {
    Location location = new Location(new Coordinate(23, 42), new Orientation(Compass.NORTH));
    LocateRoverHandler locateRoverHandler = new LocateRoverHandler(locationFinder);
    given(locationFinder.find()).willReturn(location);

    assertThat(locateRoverHandler.handle()).isEqualTo(location);
  }
}
