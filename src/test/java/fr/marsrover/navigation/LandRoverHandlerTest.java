package fr.marsrover.navigation;

import fr.marsrover.eventsourcing.*;
import fr.marsrover.geolocation.Coordinate;
import fr.marsrover.geolocation.Location;
import fr.marsrover.geolocation.Orientation;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.time.LocalDateTime;
import java.time.Month;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class LandRoverHandlerTest {
  private final LandedRoverEventPayload EVENT_PAYLOAD = new LandedRoverEventPayload(new Location(new Coordinate(23, 42), new Orientation(Compass.NORTH)));
  private Event roverLandedEvent = new Event(
          EventName.ROVER_LANDED,
          LocalDateTime.of(2017, Month.NOVEMBER, 1, 18, 52),
          EVENT_PAYLOAD);

  @Mock
  private EventFactory eventFactory;
  @Mock
  private EventStore eventStore;
  private LandRoverHandler handler;

  @Before
  public void setUp() throws Exception {
    handler = new LandRoverHandler(eventFactory, eventStore);
  }
  @Test
  public void should_store_landing_rover_at_given_coordinate() throws Exception {
    // Given a command
    given(eventFactory.justNow(EventName.ROVER_LANDED, EVENT_PAYLOAD)).willReturn(roverLandedEvent);
    LandRoverCommand landRoverCommand = new LandRoverCommand(new Location(new Coordinate(23, 42), new Orientation(Compass.NORTH)));
    // When handles it
    handler.handle(landRoverCommand);
    // Then emit event
    verify(eventStore).log(roverLandedEvent);
  }
}
