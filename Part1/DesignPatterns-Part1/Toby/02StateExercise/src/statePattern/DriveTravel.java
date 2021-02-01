package statePattern;

public class DriveTravel implements TravelMode {
  @Override public int getEta() {
    System.out.println("Calculating ETA (driving)");
    return 1;
  }

  @Override public int getDirection() {
    System.out.println("Calculating Direction (driving)");
    return 1;
  }
}
