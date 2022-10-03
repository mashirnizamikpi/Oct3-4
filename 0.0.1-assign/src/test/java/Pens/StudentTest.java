package Pens;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class StudentTest {
	@Test
	public void Student() {
		Student st = new Student();// Creating the object of the class "c"
		int c = st.Pcost(100,150);//Getting method through 
		assertEquals(250,c);
		System.out.println("the cost of student pencil "+" "+c );
		int d = st.Penprice(100,100);//Getting method through 
		assertEquals(200,d);
		System.out.println("cost of student pen is "+" "+ d);
	}
	

}
