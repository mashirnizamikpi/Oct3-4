package Adder;

public interface Summer extends Calculator {
	

	 public default int add(int a,int b,int c) {
		 
		 return a+b+c;
	 }
		
		
	
}
