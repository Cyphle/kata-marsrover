package fr.marsrover.navigation;

import fr.marsrover.eventsourcing.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.time.LocalDateTime;
import java.time.Month;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class DriveRoverHandlerTest {
  private static final DrivenRoverEventPayload EVENT_PAYLOAD = new DrivenRoverEventPayload(DrivingInstruction.MOVE_FORWARD);
  private Event roverDrivenEvent = new Event(
          EventName.ROVER_DRIVEN,
          LocalDateTime.of(2017, Month.NOVEMBER, 1, 18, 52),
          EVENT_PAYLOAD);

  @Mock
  private EventFactory eventFactory;
  @Mock
  private EventStore eventStore;
  private DriveRoverHandler driveRoverHandler;

  @Before
  public void setUp() throws Exception {
    driveRoverHandler = new DriveRoverHandler(eventFactory, eventStore);
  }

  @Test
  public void should_emit_event_when_a_driving_command_is_applied() throws Exception {
    // Given a command
    given(eventFactory.justNow(EventName.ROVER_DRIVEN, new DrivenRoverEventPayload(DrivingInstruction.MOVE_FORWARD))).willReturn(roverDrivenEvent);
    DriveRoverCommand driveRoverCommand = new DriveRoverCommand(DrivingInstruction.MOVE_FORWARD);
    // When handles it
    driveRoverHandler.handle(driveRoverCommand);
    // Then emit event
    verify(eventStore).log(roverDrivenEvent);
  }
}
