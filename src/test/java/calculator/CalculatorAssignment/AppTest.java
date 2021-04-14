package calculator.CalculatorAssignment;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.epam.tat.module4.Calculator;

public class AppTest {

	private Calculator calculator;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@BeforeTest(groups = { "positive", "negative" })
	public void setUp() {
		calculator = new Calculator();
	}

	
	@Test(dataProvider = "provider",groups = { "positive" })

	public void test1(Integer n1,Integer n2) {
		long actual = calculator.sum(n1, n2);
		long expected = n1+n2;
		Assert.assertEquals(actual, expected);
	}

	@Test(groups = { "negative" })
	public void test2() {
		long actual = calculator.div(10, -1);
		long expected = -10;
		Assert.assertEquals(actual, expected);
	}

	@Test(groups = { "positive" })
	public void test3() {
		double actual = calculator.sqrt(100);
		double expected = 10.0;
		Assert.assertEquals(actual, expected);
	}

	@AfterTest
	public void tearDown() {
		calculator = null;
	}

	@DataProvider(name = "provider")
	public Object[][] createData1() {
		return new Object[][] { { 1, 1 }, { 2, 2 }, };
	}

}
