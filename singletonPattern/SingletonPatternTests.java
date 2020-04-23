package singletonPattern;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class SingletonPatternTests {

	@Test
	public void TestMessage() {
		SingleObject object = SingleObject.getInstance();
		assertEquals("Hello World", object.getMessage());
	}
	
	@Test
	public void TestObjectType() {
		SingleObject object = SingleObject.getInstance();
		assertEquals("class singletonPattern.SingleObject", object.getClass().toString());
	}
}
