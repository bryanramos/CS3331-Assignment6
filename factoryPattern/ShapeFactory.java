package factoryPattern;

public class ShapeFactory {

	public Shape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		} else if (shapeType.equalsIgnoreCase("Square")) {
			return new Square();
		} else if (shapeType.equalsIgnoreCase("Triangle")) {
			return new Triangle();
		} else if (shapeType.equalsIgnoreCase("Rectangle")) {
			return new Rectangle();
		}
		
		return null;
	}
}
