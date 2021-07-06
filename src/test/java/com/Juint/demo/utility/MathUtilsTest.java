package com.Juint.demo.utility;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MathUtilsTest {
	MathUtils mathUtils;
	@BeforeAll
	 void beforeAll() {
		System.out.println("this needs to run before all");
	}
	
	@BeforeEach
	void init()
	{
		 mathUtils=new MathUtils();
	}
	@AfterEach
	void destroy()
	{
		System.out.println("cleaning up.....");
	}
	
	@Test
	@Disabled
	void test() {
		System.out.println("this test run");
		
		//int expected=1;
		//int actual=mathUtils.add(0, 1);
		assertEquals(1, mathUtils.add(0, 1));
	}
	@Test
	@DisplayName("divide test")
	@Disabled
	void testDivide()
	{
		
		assertThrows(ArithmeticException.class, ()->mathUtils.divide(1, 0),"divide by zero");
		
		
	}
	
	@Test
	@Disabled
	void testAreaofCircle()
	{
	
	assertEquals(3.141592653589793, mathUtils.computeArea(1));
	}
	
	@Test
	@DisplayName("SUbString")
	@Disabled
	void testSubString() {
		assertEquals("xirish",mathUtils.subString("girish"),"this will perform substring");
	}
	
	@Test
	@Disabled
	public void readConsole() {
		MathUtils.readConsole();
	}
	
	@Test
	public void testList() {
		MathUtils.listFinding();
	}
	
}
