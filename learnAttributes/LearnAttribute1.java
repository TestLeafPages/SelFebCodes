package learnAttributes;

import org.testng.annotations.Test;

public class LearnAttribute1 {
	
	@Test
	public void test1() {
		System.out.println("test1");
	}
	
	@Test(priority = 0)
	public void test2() {
		System.out.println("test2");
	}
	
	@Test(priority = -4)
	public void test3() {
		System.out.println("test3");
	}
	
	@Test(priority = 0)
	public void test0() {
		System.out.println("test0");
	}

}
