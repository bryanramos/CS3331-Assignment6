package facadePattern;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

public class FacadePatternTests {

	@Test 
	public void LineTest() {
		ShapeMaker shapeMaker = new ShapeMaker();
		assertEquals(shapeMaker.getLine().getClass().toString(), "class facadePattern.Line");
	}
	
	@Test
	public void ParallelogramTest() {
		ShapeMaker shapeMaker = new ShapeMaker();
		assertEquals(shapeMaker.getParallelogram().getClass().toString(), "class facadePattern.Parallelogram");
	}
	
	@Test
	public void Trapezoid() {
		ShapeMaker shapeMaker = new ShapeMaker();
		assertEquals(shapeMaker.getTrapezoid().getClass().toString(), "class facadePattern.Trapezoid");
		
	}
}
