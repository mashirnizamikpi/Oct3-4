package Pens;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TeacherTest {
	@Test
	public void Student() {
		Teacher te = new Teacher();// Creating the object of the class "c"
		int e = te.Pcost(100,150);//Getting method through 
		assertEquals(500,e);
		System.out.println("the cost of teacher pen"+" "+e );
		int f = te.Penprice(100,100);//Getting method through 
		assertEquals(400,f);
		System.out.println("the cost of teacher pencil"+" "+f );
	}
	

}
