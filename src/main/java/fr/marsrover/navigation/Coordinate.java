package fr.marsrover.navigation;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class Coordinate {
  private int x;
  private int y;

  public Coordinate(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int getXCoordinate() {
    return x;
  }

  public int getYCoordinate() {
    return y;
  }
}
