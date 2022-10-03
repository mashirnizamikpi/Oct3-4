package Pens;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class StudentTest {
	@Test
	public void Student() {
		Student st = new Student();// Creating the object of the class "c"
		int c = st.Pcost(100,150);//Getting method through 
		assertEquals(250,c);
		int d = st.Penprice(100,100);//Getting method through 
		assertEquals(200,d);
	}

}
