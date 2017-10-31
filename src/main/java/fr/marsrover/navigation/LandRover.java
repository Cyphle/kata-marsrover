package fr.marsrover.navigation;

public class LandRover {
  private Coordinate coordinate;
  private Orientation orientation;

  public LandRover(Coordinate coordinate, Orientation orientation) {
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
}
