package springmvcexample;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MySampTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Before text");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("After text");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Before");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("After");
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
		int age=18;
		System.out.println("Age=18");
		assertEquals(18,18);
	}

}
