package fr.marsrover.eventsourcing;

import fr.marsrover.navigation.Compass;
import fr.marsrover.navigation.Coordinate;
import fr.marsrover.navigation.Orientation;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDateTime;
import java.time.Month;

import static org.assertj.core.api.Assertions.assertThat;

public class EventFactoryTest {
  private EventFactory eventFactory;

  @Before
  public void setUp() throws Exception {
    eventFactory = new EventFactory();
  }

  @Test
  public void should_generate_event_with_something_happens() throws Exception {
    LandedRoverEventPayload eventPayload = new LandedRoverEventPayload(new Coordinate(23, 42), new Orientation(Compass.NORTH));
    Event generatedEvent = eventFactory.justNow(EventName.ROVER_LANDED, eventPayload);
    assertThat(generatedEvent).isEqualTo(new Event(EventName.ROVER_LANDED, LocalDateTime.of(2017, Month.NOVEMBER, 1, 18, 52), eventPayload));
  }
}
