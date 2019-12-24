import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.testng.annotations.AfterClass;


public class TestsTest {

	private Tests test;

	@BeforeClass
	public static void launch()
	{
		System.out.println("BeforeClassLaunch");
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\chromedriver\\chromedriver.exe");
	}

	
	/*
	@Before
	public void init (){
		System.out.println("is it inits?");
		test = new Tests();
	}
	
	@After
	public void nulling(){
		test = null;
	} 
	*/
	
	@Test
	public void testPremium()throws Exception {
		System.out.println("is it runs?");
		assertTrue(Tests.PremiumPageOpeningTest());
			
		
		//fail("Not yet implemented");
	}

	@AfterClass
	public void Closing(){
		System.out.println("closing");
		Methods.tearDown();
	}
	
}
