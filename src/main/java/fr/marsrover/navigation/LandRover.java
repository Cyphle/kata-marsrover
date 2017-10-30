package fr.marsrover.navigation;

public class LandRover {
  private int xCoordinate;
  private int yCoordinate;

  public LandRover(int xCoordinate, int yCoordinate) {
    this.xCoordinate = xCoordinate;
    this.yCoordinate = yCoordinate;
  }

  public int getXCoordinate() {
    return xCoordinate;
  }

  public int getYCoordinate() {
    return yCoordinate;
  }
}
