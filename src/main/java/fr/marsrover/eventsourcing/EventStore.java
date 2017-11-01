package fr.marsrover.eventsourcing;

public interface EventStore {
  void log(Event event);
}
