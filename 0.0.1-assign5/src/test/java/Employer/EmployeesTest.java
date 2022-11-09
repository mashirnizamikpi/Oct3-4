package Employer;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EmployeesTest {


	@Test
	
	public void ans() {
		Arinjay ar = new Arinjay();
		


		

		int legs = ar.Empid();
		int net = ar.salary();
		int cat = ar.groupId();
		String na = ar.Name();


		

		
		assertEquals(1121, legs);
		assertEquals(1000, net);
		assertEquals(57123, cat);
		assertEquals("Arinjay",na);
		


	}


@Test
	
	public void mas() {
	Mashir ma = new Mashir();
	
	int base = ma.Empid();
	int rat = ma.salary();
	int amt = ma.groupId();
	String sat = ma.Name();

	assertEquals(1010, base);
	assertEquals(100000, rat);
	assertEquals(84290, amt);
	assertEquals("Mashir Nizami",sat);
}

}











