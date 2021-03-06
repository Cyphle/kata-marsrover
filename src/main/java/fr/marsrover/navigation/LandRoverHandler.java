package fr.marsrover.navigation;

import fr.marsrover.eventsourcing.*;
import fr.marsrover.geolocation.Location;

public class LandRoverHandler {
  private EventFactory eventFactory;
  private EventStore eventStore;

  public LandRoverHandler(EventFactory eventFactory, EventStore eventStore) {
    this.eventFactory = eventFactory;
    this.eventStore = eventStore;
  }

  public void handle(LandRoverCommand landRoverCommand) {
    Event roverLanded = eventFactory.justNow(
            EventName.ROVER_LANDED,
            new LandedRoverEventPayload(new Location(landRoverCommand.getCoordinate(), landRoverCommand.getOrientation())));
    eventStore.log(roverLanded);
  }
}
