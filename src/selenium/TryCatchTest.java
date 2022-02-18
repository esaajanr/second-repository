package selenium;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class TryCatchTest {
	
	@Rule
	public ErrorCollector err = new ErrorCollector();
	
	

	@Test
	public void test6() {
		
		String actual = "abc";
		String expected = "abc1";
		System.out.println("Before 1st Assert");
		try {
		Assert.assertEquals(expected, actual);
		}catch(Throwable t) {
			err.addError(t);
			System.out.println("I'm in Catch1");
		}
		System.out.println("After 1st assert"); // we use regular assert in the industry
		try {
		Assert.assertTrue("verify2>3", 2>3);
		}catch(Throwable t) {
			err.addError(t);
			System.out.println("I'm in Catch2");
		}
		System.out.println("After 2nd assert");
		
	}
	
	@Test
	public void test7() {
		String actual = "abc";
		String expected = "abc1";
		System.out.println("before 1st Assert");
		try {
		Assert.assertEquals(expected, actual); 
		}catch(Throwable t) {
			err.addError(t);
			System.out.println("I'm in Catch1");
		}
		System.out.println("After 1st Assert");
		try {
		Assert.assertTrue("Verify 2>3", 2>3);
		}catch(Throwable t) {
			err.addError(t);
			System.out.println("I'm in catch2");
		}
		System.out.println("After 2nd Assert");
	}


}
