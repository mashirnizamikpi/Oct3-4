package Employees;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Employee{
	
	public static String start() {
		

	System.out.println("Employees = EmpId");

	//when we using HashMap for two parameters at one time
Map<Integer,String> map = new HashMap<Integer,String>();

map.put(9192,"Amit");
map.put(9193,"Ashok");
map.put(9194,"Brishej");
map.put(9195,"Chander");
map.put(9196,"Mashir");
map.put(9197,"Peter");
map.put(9197,"Rakesh");

System.out.println(map);
return map.get(9195);
	
	

}



}
