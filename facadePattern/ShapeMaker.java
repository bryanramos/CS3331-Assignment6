package facadePattern;

public class ShapeMaker {
	private Shape line;
	private Shape parallelogram;
	private Shape trapezoid;
	
	public ShapeMaker() {
		line = new Line();
		parallelogram = new Parallelogram();
		trapezoid = new Trapezoid();
	}
	
	public void drawLine() {
		line.draw();
	}
	
	public void drawParallelogram() {
		parallelogram.draw();
	}
	
	public void drawTrapezoid() {
		trapezoid.draw();
	}
	
	Shape getLine() {
		return line;
	}
	
	Shape getParallelogram() {
		return parallelogram;
	}
	
	Shape getTrapezoid() {
		return trapezoid;
	}
	
}
