package Adder;

public interface Adder extends Calculator{
	
	public default int add(int a,int b) {
		
		return a+b;
		
	}
	


}
