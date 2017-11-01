package fr.marsrover.navigation;

public interface EventStore {
  void log(Event event);
}
