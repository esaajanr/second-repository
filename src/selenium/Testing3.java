package selenium;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Testing3 {

	@Test
	public void test6() {
		String actual = "abc";
		String expected = "abc1";
		Assert.assertEquals(expected, actual);
		System.out.println("After 1st assert"); // we use regular assert in the industry
		Assert.assertTrue("verify2>3", 2>3);
		System.out.println("After 2nd assert");
	}

	
	@Test
	public void test7() {
		System.out.println("-----------Test7-----------");
		String actual = "abc";
		String expected = "abc";
		Assert.assertEquals(expected, actual);
		System.out.println("After 1st assert"); // we use regular assert in the industry
		Assert.assertTrue("verify2>3", 2>3);
		System.out.println("After 2nd assert");
		
	}
	
	@Test
	public void test8() {
		System.out.println("-----------Test8------------");
		String actual = "abc";
		String expected = "abc";
		Assert.assertEquals(expected, actual);
		System.out.println("After 1st assert"); // we use regular assert in the industry
		Assert.assertTrue("verify2>3", 5>3);
		System.out.println("After 2nd assert");
	}
}


