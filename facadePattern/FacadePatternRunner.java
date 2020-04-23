package facadePattern;

public class FacadePatternRunner {
	public static void main(String[] args) {
		ShapeMaker shapeMaker = new ShapeMaker();
		
		shapeMaker.drawLine();
		shapeMaker.drawParallelogram();
		shapeMaker.drawTrapezoid();
	}
}
