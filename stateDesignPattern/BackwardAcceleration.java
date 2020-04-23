package stateDesignPattern;

public class BackwardAcceleration implements State {
	
	public void doAction(Context context) {
		System.out.println("Rover is in backwards acceleration state");
		context.setState(this);
	}
	
	public String toString() {
		return "Backwards Acceleration";
	}
}
