package fr.marsrover.navigation;

public class LandRoverHandler {
  private AnEventHappened anEventHappened;
  private EventStore eventStore;

  public LandRoverHandler(AnEventHappened anEventHappened, EventStore eventStore) {
    this.anEventHappened = anEventHappened;
    this.eventStore = eventStore;
  }

  public void handle(LandRover landRover) {
    Event roverLanded = anEventHappened.justNow(
            EventName.ROVER_LANDED,
            new EventData(landRover.getCoordinates(), landRover.getOrientation()));
    eventStore.log(roverLanded);
  }
}
