package fr.marsrover.eventsourcing;

import fr.marsrover.geolocation.Location;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class LandedRoverEventPayload extends EventPayload {
  private Location location;

  public LandedRoverEventPayload(Location location) {
    this.location = location;
  }
}
