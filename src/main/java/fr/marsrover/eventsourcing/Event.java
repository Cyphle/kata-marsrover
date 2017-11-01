package fr.marsrover.eventsourcing;

import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

@EqualsAndHashCode
public class Event {
  private EventName eventName;
  private LocalDateTime receivedDatetime;
  private EventPayload eventPayload;

  public Event(EventName eventName, LocalDateTime receivedDatetime, EventPayload eventPayload) {
    this.eventName = eventName;
    this.receivedDatetime = receivedDatetime;
    this.eventPayload = eventPayload;
  }

  public EventName getName() {
    return eventName;
  }

  public LocalDateTime getReceivedDatetime() {
    return receivedDatetime;
  }

  public EventPayload getPayload() {
    return eventPayload;
  }
}
