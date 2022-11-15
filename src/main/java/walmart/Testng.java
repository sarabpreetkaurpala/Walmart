package walmart;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testng extends base {
	POMwalmart pom;

	
	public Testng() {
		super ();
		 
		
	}
	
	@BeforeMethod
	public void setup () {
		initiate ();
		pom = new POMwalmart ();
	}
	
	@Test 
	public void test1 () {
	String title =	driver.getTitle();
		System.out.println(title);
		
	}
	@Test void test2 () {
		pom.Test1();
	}
	
	@Test void test3 () {
		pom.Test2();
	}
	
@AfterMethod 
public void close () {
	driver.close ();
}
	
	
	
	
	
	
	
}
