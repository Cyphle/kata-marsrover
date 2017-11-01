package fr.marsrover.navigation;

import fr.marsrover.geolocation.Coordinate;
import fr.marsrover.geolocation.Location;
import fr.marsrover.geolocation.Orientation;

public class LandRoverCommand {
  private Location location;

  public LandRoverCommand(Location location) {
    this.location = location;
  }

  public int getXCoordinate() {
      return location.getXCoordinate();
  }

  public int getYCoordinate() {
      return location.getYCoordinate();
  }

  public Compass getCompass() {
      return location.getCompass();
  }

  public Coordinate getCoordinate() {
    return location.getCoordinate();
  }

  public Orientation getOrientation() {
    return location.getOrientation();
  }
}
