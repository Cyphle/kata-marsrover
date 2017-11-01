package fr.marsrover.navigation;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class Orientation {
  private Compass compass;

  public Orientation(Compass compass) {
    this.compass = compass;
  }

  public Compass getCompass() {
    return compass;
  }
}
