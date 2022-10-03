package Adder;

public interface Summer extends Calculator {
	//solution for method overloading of Diamond Problem

	 public default int add(int a,int b,int c) {
		 
		 return a+b+c;
	 }
		
		
	
}
