package junit;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)

public class TestMultiply extends Assert {

	private double x;
	private double y;
	private double result;

	public TestMultiply(double x, double y, double result) {
		this.x = x;
		this.y = y;
		this.result = result;
	}

	@Parameterized.Parameters(name = "{0} * {1} = {2}")
	public static Iterable<Object[]> elements() {
		return Arrays.asList(new Object[][] { { 1, 2, 2 }, { 1000, -2300, -230000 }, { 35, 25, 875 } });
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testMultiply() {
		assertEquals(result, Calculator.getMultiply(x, y));

	}
}
