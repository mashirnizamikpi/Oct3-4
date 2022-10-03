package Paper;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PaperTest {
	
	
	@Test
	public void Letter() {
		Letter l = new Letter();// Creating the object of the class "c"
		int a = l.cost(2,5);//Getting method through 
		assertEquals(10,a);
		int b = l.price(1,5);//Getting method through 
		assertEquals(5,b);
	}
	
	@Test
	public void A4() {
		A4 af = new A4();// Creating the object of the class "c"
		int c = af.cost(3,5);//Getting method through 
		assertEquals(15,c);
		int d = af.price(6,5);//Getting method through 
		assertEquals(30,d);
	}
	
	@Test
	public void Legal() {
		Legal le = new Legal();// Creating the object of the class "c"
		int e = le.cost(5,6);//Getting method through 
		assertEquals(30,e);
		int f = le.price(10,5);//Getting method through 
		assertEquals(50,f);
	}
	
	@Test
	public void Chart() {
		Chart ch = new Chart();// Creating the object of the class "c"
		int g = ch.cost(7,5);//Getting method through 
		assertEquals(35,g);
		int h = ch.price(8,5);//Getting method through 
		assertEquals(40,h);
	}

}


