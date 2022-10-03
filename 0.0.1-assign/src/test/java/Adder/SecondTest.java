package Adder;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
//solution for method overloading of Diamond Problem
public class SecondTest {

	@Test
	public void First() {
		First f = new First();// Creating the object of the class "c"
		int q = f.add(1000,100);//Getting method through 
		assertEquals(1100,q);
		
		int d = f.add(1000,1000,2000);//Getting method through 
		assertEquals(4000,d);
		
	}

}
