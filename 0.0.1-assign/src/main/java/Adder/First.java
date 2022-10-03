package Adder;

public class First implements Summer,Adder {

		
	//solution for method overloading of Diamond Problem

	public void start()
	{
		
		Adder.super.add(3,4);
		Summer.super.add(2,6,5);
		
	}

	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}




	public int add(int a, int b, int c) {
		// TODO Auto-generated method stub
		return a+b+c;
	}







	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}












}
