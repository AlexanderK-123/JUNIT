package junit;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)

public class TestDevide extends Assert {

	private double x;
	private double y;
	private double result;

	public TestDevide(double x, double y, double result) {
		this.x = x;
		this.y = y;
		this.result = result;
	}

	@Parameterized.Parameters(name = "{0} / {1} = {2}")
	public static Iterable<Object[]> elements() {
		return Arrays.asList(new Object[][] { { 4, 2, 2 }, { 1000, -10, -100 }, { 35, 5, 7 } });
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testDevide() {
		assertEquals(result, Calculator.getMultiply(x, y));

	}

}
