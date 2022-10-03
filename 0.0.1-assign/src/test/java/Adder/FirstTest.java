package Adder;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

//solution for method overloading of Diamond Problem
public class FirstTest {
	@Test
	public void First() {
		First f = new First();// Creating the object of the class "c"
		int q = f.add(100,150);//Getting method through 
		assertEquals(250,q);
		
		int d = f.add(100,100,200);//Getting method through 
		assertEquals(400,d);
		
	}

}
