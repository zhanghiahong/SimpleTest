package test;

import static org.junit.Assert.*;

import org.ClassC;
import org.junit.Test;

public class ClassCTest {
	
	ClassC cc=new ClassC();

	@Test
	public void testConnectString() {
		String first="A";
		String second="B";
		String result="AB";
		
		assertEquals(result, cc.ConnectString(first, second));
		
	}

	@Test
	public void testGetClassName() {
		fail("Not yet implemented");
	}

}
