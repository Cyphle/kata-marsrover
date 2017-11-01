package fr.marsrover.navigation;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class EventData {
  private Coordinate coordinate;
  private Orientation orientation;

  public EventData(Coordinate coordinate, Orientation orientation) {
    this.coordinate = coordinate;
    this.orientation = orientation;
  }
}
