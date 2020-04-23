package singletonPattern;

public class SingleObject {
	// create an object of SingleObject
	private static SingleObject instance = new SingleObject();
	
	// make the constructor private so that this class cannot be
	// instantianted
	private SingleObject() {}
	
	// get the only object available
	public static SingleObject getInstance() {
		return instance;
	}
	
	public String getMessage() {
		return "Hello World";
	}
	
	public void showMessage() {
		getMessage();
	}
}
