package junit;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)

public class TestSum extends Assert {

	private double x;
	private double y;
	private double result;

	public TestSum(double x, double y, double result) {
		this.x = x;
		this.y = y;
		this.result = result;
	}

	@Parameterized.Parameters(name = "{0} + {1} = {2}")
	public static Iterable<Object[]> elements() {
		return Arrays.asList(new Object[][] { { 1, 2, 3 }, { 1000, -2300, -1300 }, { 14, 115, 129 } });
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testSum() {
		assertEquals(result, Calculator.getSum(x, y));

	}
}
