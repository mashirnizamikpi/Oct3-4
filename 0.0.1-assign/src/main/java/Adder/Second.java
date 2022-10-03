package Adder;

public class Second implements Summer,Adder {

		


	public void start()
	{
		
		Adder.super.add(6,8);
		Summer.super.add(9,11,13);
		
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
