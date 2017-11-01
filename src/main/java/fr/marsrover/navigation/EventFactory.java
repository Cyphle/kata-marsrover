package fr.marsrover.navigation;

/*
EVENT FACTORE
 */
public interface EventFactory {
  Event justNow(EventName eventName, EventData eventData);
}
