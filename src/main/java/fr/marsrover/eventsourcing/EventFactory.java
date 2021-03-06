package fr.marsrover.eventsourcing;

import java.time.LocalDateTime;
import java.time.Month;

public class EventFactory {
  private DateService dateService = new DateService();

  public Event justNow(EventName eventName, EventPayload eventPayload) {
    return new Event(eventName, dateService.now(), eventPayload);
  }

  private class DateService {
    public LocalDateTime now() {
      return LocalDateTime.of(2017, Month.NOVEMBER, 1, 18, 52);
    }
  }
}
