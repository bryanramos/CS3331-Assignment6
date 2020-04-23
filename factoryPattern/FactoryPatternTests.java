package factoryPattern;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

public class FactoryPatternTests {

	@Test
	public void SquareTest() {
		ShapeFactory shapeFactory = new ShapeFactory();
		
		Shape shape = shapeFactory.getShape("Square");
		assertEquals(shape.getClass().toString(), "class factoryPattern.Square");
	}
	
	@Test
	public void RectangleTest() {
		ShapeFactory shapeFactory = new ShapeFactory();
		
		Shape shape = shapeFactory.getShape("Rectangle");
		assertEquals(shape.getClass().toString(), "class factoryPattern.Rectangle");
	}
	
	@Test
	public void TriangleTest() {
		ShapeFactory shapeFactory = new ShapeFactory();
		
		Shape shape = shapeFactory.getShape("Triangle");
		assertEquals(shape.getClass().toString(), "class factoryPattern.Triangle");
	}
	
}
