package fr.marsrover.eventsourcing;

import fr.marsrover.navigation.Coordinate;
import fr.marsrover.navigation.Orientation;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class EventData extends EventPayload {
  private Coordinate coordinate;
  private Orientation orientation;

  public EventData(Coordinate coordinate, Orientation orientation) {
    this.coordinate = coordinate;
    this.orientation = orientation;
  }
}
