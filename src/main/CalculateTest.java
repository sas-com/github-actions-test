package main;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculateTest
{

	@Test
	public void test()
	{
		Calculate cal = new Calculate();

		int expected = 5;
		int actual = cal.add(2, 3);

		assertEquals(actual, expected);
	}
}
