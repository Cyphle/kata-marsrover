package fr.marsrover.navigation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class LandRoverHandlerTest {
  private final EventData EVENT_DATA = new EventData(new Coordinate(23, 42), new Orientation(Compass.NORTH));
  private Event roverLanded = new Event();
  @Mock
  private AnEventHappened anEventHappened;
  @Mock
  private EventStore eventStore;

  @Test
  public void should_store_landing_rover_at_given_coordinate() throws Exception {
    LandRoverHandler handler = new LandRoverHandler(anEventHappened, eventStore);
    LandRover landRover = new LandRover(new Coordinate(23, 42), new Orientation(Compass.NORTH));

    given(anEventHappened.justNow(EventName.ROVER_LANDED, EVENT_DATA)).willReturn(roverLanded);

    handler.handle(landRover);

    verify(eventStore).log(roverLanded);
  }
}
