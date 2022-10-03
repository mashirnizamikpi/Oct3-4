package Employees;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.framework.Assert;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertEquals;
public class EmployeeTest {
	
	@Test

	public void Employee() {
		Employee emp = new Employee();
 	
	    Assert.assertNotNull("Provided Map is full", emp);
	 assertEquals("Chander",Employee.start());
	    	 
	}
}