package fr.marsrover.navigation;

public class LandRover {
  private int xCoordinate;
  private int yCoordinate;
  private Orientation orientation;

  public LandRover(int xCoordinate, int yCoordinate, Orientation orientation) {
    this.xCoordinate = xCoordinate;
    this.yCoordinate = yCoordinate;
    this.orientation = orientation;
  }

  public int getXCoordinate() {
    return xCoordinate;
  }

  public int getYCoordinate() {
    return yCoordinate;
  }

  public Orientation getOrientation() {
    return orientation;
  }
}
