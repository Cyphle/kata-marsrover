package fr.marsrover.navigation;

public class LandRoverCommand {
  private Coordinate coordinates;
  private Orientation orientation;

  public LandRoverCommand(Coordinate coordinates, Orientation orientation) {
    this.coordinates = coordinates;
    this.orientation = orientation;
  }

  public int getXCoordinate() {
    return coordinates.getXCoordinate();
  }

  public int getYCoordinate() {
    return coordinates.getYCoordinate();
  }

  public Compass getCompass() {
    return orientation.getCompass();
  }

  public Coordinate getCoordinates() {
    return coordinates;
  }

  public Orientation getOrientation() {
    return orientation;
  }
}
