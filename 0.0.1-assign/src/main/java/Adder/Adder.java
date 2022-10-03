package Adder;

public interface Adder extends Calculator{
	//solution for method overloading of Diamond Problem
	public default int add(int a,int b) {
		
		return a+b;
		
	}
	


}
