package fr.marsrover.navigation;

import fr.marsrover.eventsourcing.*;

public class DriveRoverHandler {
  private EventFactory eventFactory;
  private EventStore eventStore;

  public DriveRoverHandler(EventFactory eventFactory, EventStore eventStore) {
    this.eventFactory = eventFactory;
    this.eventStore = eventStore;
  }

  public void handle(DriveRoverCommand driveRoverCommand) {
    Event riverDrivenEvent = eventFactory.justNow(EventName.ROVER_DRIVEN, new DrivenRoverEventPayload(driveRoverCommand.getInstruction()));
    eventStore.log(riverDrivenEvent);
  }
}
