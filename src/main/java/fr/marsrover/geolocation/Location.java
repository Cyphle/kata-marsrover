package fr.marsrover.geolocation;

import fr.marsrover.navigation.Compass;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class Location {
  private Coordinate coordinate;
  private Orientation orientation;

  public Location(Coordinate coordinate, Orientation orientation) {
    this.coordinate = coordinate;
    this.orientation = orientation;
  }

  public int getXCoordinate() {
    return coordinate.getXCoordinate();
  }

  public int getYCoordinate() {
    return coordinate.getYCoordinate();
  }

  public Compass getCompass() {
    return orientation.getCompass();
  }

  public Coordinate getCoordinate() {
    return coordinate;
  }

  public Orientation getOrientation() {
    return orientation;
  }
}
