package fr.marsrover.navigation;

/*
EVENT FACTORE
 */
public interface AnEventHappened {
  Event justNow(EventName eventName, EventData eventData);
}
