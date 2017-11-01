package fr.marsrover.location;

public class LocateRoverHandler {
  private LocationFinder locationFinder;

  public LocateRoverHandler(LocationFinder locationFinder) {
    this.locationFinder = locationFinder;
  }

  public Location handle() {
    return locationFinder.find();
  }
}
