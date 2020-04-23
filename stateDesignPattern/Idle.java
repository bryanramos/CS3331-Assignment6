package stateDesignPattern;

public class Idle implements State {
	public void doAction(Context context) {
		System.out.println("Rover is in idle state");
		context.setState(this);
	}
	
	public String toString() {
		return "Idle";
	}
}
