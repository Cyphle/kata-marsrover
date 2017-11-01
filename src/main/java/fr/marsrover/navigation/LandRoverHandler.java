package fr.marsrover.navigation;

public class LandRoverHandler {
  private EventFactory eventFactory;
  private EventStore eventStore;

  public LandRoverHandler(EventFactory eventFactory, EventStore eventStore) {
    this.eventFactory = eventFactory;
    this.eventStore = eventStore;
  }

  public void handle(LandRover landRover) {
    Event roverLanded = eventFactory.justNow(
            EventName.ROVER_LANDED,
            new EventData(landRover.getCoordinates(), landRover.getOrientation()));
    eventStore.log(roverLanded);
  }
}
