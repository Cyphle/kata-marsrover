package fr.marsrover.navigation;

public class LandRover {
  private Orientation orientation;
  private Coordinate coordinate;

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

  public Orientation getOrientation() {
    return orientation;
  }
}
