package Question2;

public class Dhokla implements Food{

	public void taste() {
		// TODO Auto-generated method stub
		System.out.println("Good");
	}

	public void state() {
		// TODO Auto-generated method stub
		System.out.println("Gujarat");
		
	}

	public void ingred() {
		// TODO Auto-generated method stub
		System.out.println("20");
		
	}
	
	public static void main(String args[]) {
		Dhokla dh=new Dhokla();
		dh.taste();
		dh.state();
		dh.ingred();
	}

}