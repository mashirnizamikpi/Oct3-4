package Question2;

public class Burger implements Food{

	public void taste() {
		// TODO Auto-generated method stub
		System.out.println("Best");
	}

	public void state() {
		// TODO Auto-generated method stub
		System.out.println("India");
		
	}

	public void ingred() {
		// TODO Auto-generated method stub
		System.out.println("20");
		
	}
	
	public static void main(String args[]) {
		Burger b=new Burger();
		b.taste();
		b.state();
		b.ingred();
	}

}