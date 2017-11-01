package fr.marsrover.eventsourcing;

import fr.marsrover.navigation.DrivingInstruction;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class DrivenRoverEventPayload extends EventPayload {
  private DrivingInstruction drivingInstruction;

  public DrivenRoverEventPayload(DrivingInstruction drivingInstruction) {
    this.drivingInstruction = drivingInstruction;
  }
}
