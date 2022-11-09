package Question2;

public class Waffles implements Food{

	public void taste() {
		// TODO Auto-generated method stub
		System.out.println("Good");
	}

	public void state() {
		// TODO Auto-generated method stub
		System.out.println("Italy");
		
	}

	public void ingred() {
		// TODO Auto-generated method stub
		System.out.println("2");
		
	}
	
	public static void main(String args[]) {
		Waffles w=new Waffles();
		w.taste();
		w.state();
		w.ingred();
	}

}