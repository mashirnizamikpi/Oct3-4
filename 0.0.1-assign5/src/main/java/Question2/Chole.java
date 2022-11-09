package Question2;

public class Chole implements Food{

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
		System.out.println("10");
		
	}
	
	public static void main(String args[]) {
		Chole c=new Chole();
		c.taste();
		c.state();
		c.ingred();
	}

}