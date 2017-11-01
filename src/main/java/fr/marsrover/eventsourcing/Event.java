package fr.marsrover.eventsourcing;

import java.time.LocalDateTime;

public class Event {
  private EventName eventName;
  private LocalDateTime receivedDatetime;

  public Event(EventName eventName, LocalDateTime receivedDatetime) {
    this.eventName = eventName;
    this.receivedDatetime = receivedDatetime;
  }

  public EventName getName() {
    return eventName;
  }

  public LocalDateTime getReceivedDatetime() {
    return receivedDatetime;
  }
}
