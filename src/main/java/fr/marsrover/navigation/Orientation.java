package fr.marsrover.navigation;

public class Orientation {
  private Compass compass;

  public Orientation(Compass compass) {
    this.compass = compass;
  }

  public Compass getCompass() {
    return compass;
  }
}
