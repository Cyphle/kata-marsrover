package fr.marsrover.navigation;

public class LandRover {
  private int xCoordinate;
  private int yCoordinate;
  private Orientation orientation;
  private Coordinate coordinate;

  public LandRover(int xCoordinate, int yCoordinate, Orientation orientation) {
    this.xCoordinate = xCoordinate;
    this.yCoordinate = yCoordinate;
    this.orientation = orientation;
  }

  public LandRover(Coordinate coordinate, Orientation orientation) {
    this.coordinate = coordinate;
    this.orientation = orientation;
  }

  public int getXCoordinate() {
    if (coordinate != null)
      return coordinate.getXCoordinate();
    return xCoordinate;
  }

  public int getYCoordinate() {
    if (coordinate != null)
      return coordinate.getYCoordinate();
    return yCoordinate;
  }

  public Orientation getOrientation() {
    return orientation;
  }
}
