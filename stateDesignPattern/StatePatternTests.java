package stateDesignPattern;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

public class StatePatternTests {
	public static Context context = new Context();
	
	@Test
	public void CheckIdleState() {
		Idle idle = new Idle();
		idle.doAction(context);
		assertEquals("Idle", context.getState().toString());
	}
	
	@Test
	public void CheckBackwardAccelerationState() {
		BackwardAcceleration backwardAcceleration = new BackwardAcceleration();
		backwardAcceleration.doAction(context);
		assertEquals("Backwards Acceleration", context.getState().toString());
	}
	
	@Test
	public void CheckForwardAccelerationState() {
		ForwardAcceleration forwardAcceleration = new ForwardAcceleration();
		forwardAcceleration.doAction(context);
		assertEquals("Forward Acceleration", context.getState().toString());
	}
}
