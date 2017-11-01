package fr.marsrover.eventsourcing;

import fr.marsrover.location.Location;
import fr.marsrover.navigation.Compass;
import fr.marsrover.navigation.Coordinate;
import fr.marsrover.navigation.Orientation;
import org.junit.Test;

import java.time.LocalDateTime;
import java.time.Month;

import static org.assertj.core.api.Assertions.assertThat;

public class EventTest {
  @Test
  public void should_have_received_datetime_and_name_for_event() throws Exception {
    Event event = new Event(
            EventName.ROVER_LANDED,
            LocalDateTime.of(2017, Month.NOVEMBER, 1, 18, 52),
            new LandedRoverEventPayload(new Location(new Coordinate(23, 42), new Orientation(Compass.NORTH))));
    assertThat(event.getName()).isEqualTo(EventName.ROVER_LANDED);
    assertThat(event.getReceivedDatetime()).isEqualTo(LocalDateTime.of(2017, Month.NOVEMBER, 1, 18, 52));
    assertThat(event.getPayload()).isEqualTo(new LandedRoverEventPayload(new Location(new Coordinate(23, 42), new Orientation(Compass.NORTH))));
  }
}
