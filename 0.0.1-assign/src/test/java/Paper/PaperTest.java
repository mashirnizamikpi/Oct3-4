package Paper;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PaperTest {
	
	
	@Test
	public void Letter() {
		Letter l = new Letter();// Creating the object of the class "c"
		int a = l.cost(2,5);//Getting method through 
		assertEquals(10,a);
		System.out.println("The cost of Letter:"+a);
		int b = l.price(1,5);//Getting method through 
		assertEquals(5,b);
		System.out.println("The price of Letter:"+b);
		
	}
	
	@Test
	public void A4() {
		A4 af = new A4();// Creating the object of the class "c"
		int c = af.cost(3,5);//Getting method through 
		assertEquals(15,c);
		System.out.println("The cost of A4:"+c);
		int d = af.price(6,5);//Getting method through 
		assertEquals(30,d);
		System.out.println("The price of A4:"+d);
	}
	
	@Test
	public void Legal() {
		Legal le = new Legal();// Creating the object of the class "c"
		int e = le.cost(5,6);//Getting method through 
		assertEquals(30,e);
		System.out.println("The cost of Legal:"+e);
		int f = le.price(10,5);//Getting method through 
		assertEquals(50,f);
		System.out.println("The price of Legal:"+f);
	}
	
	@Test
	public void Chart() {
		Chart ch = new Chart();// Creating the object of the class "c"
		int g = ch.cost(7,5);//Getting method through 
		assertEquals(35,g);
		System.out.println("The cost of Chart:"+g);
		int h = ch.price(8,5);//Getting method through 
		assertEquals(40,h);
		System.out.println("The price of Chart:"+h);
	}

}


