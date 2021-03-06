package stateDesignPattern;

public class ForwardAcceleration implements State {
	public void doAction(Context context) {
		System.out.println("Rover is in forward acceleration state");
		context.setState(this);
	}
	
	public String toString() {
		return "Forward Acceleration";
	}
}
