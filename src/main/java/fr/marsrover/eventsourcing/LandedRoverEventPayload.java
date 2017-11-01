package fr.marsrover.eventsourcing;

import fr.marsrover.location.Location;
import fr.marsrover.navigation.Coordinate;
import fr.marsrover.navigation.Orientation;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class LandedRoverEventPayload extends EventPayload {
  private Location location;

  public LandedRoverEventPayload(Location location) {
    this.location = location;
  }
}
