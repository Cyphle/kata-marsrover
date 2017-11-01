package fr.marsrover.eventsourcing;

public interface EventFactory {
  Event justNow(EventName eventName, EventData eventData);
}
