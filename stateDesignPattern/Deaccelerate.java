package stateDesignPattern;

public class Deaccelerate implements State {
	public void doAction(Context context) {
		System.out.println("Rover is in deacceleration state");
		context.setState(this);
	}
	
	public String toString() {
		return "Deacceleration";
	}
}
