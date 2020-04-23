package stateDesignPattern;

public class ForwardSpeed implements State {
	public void doAction(Context context) {
		System.out.println("Rover is in forward speed state");
		context.setState(this);
	}
	
	public String toString() {
		return "Forward Speed";
	}
}
