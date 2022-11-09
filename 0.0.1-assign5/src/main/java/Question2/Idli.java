package Question2;

public class Idli implements Food{

	public void taste() {
		// TODO Auto-generated method stub
		System.out.println("Good");
	}

	public void state() {
		// TODO Auto-generated method stub
		System.out.println("Overall");
		
	}

	public void ingred() {
		// TODO Auto-generated method stub
		System.out.println("5");
		
	}
	
	public static void main(String args[]) {
		Idli i=new Idli();
		i.taste();
		i.state();
		i.ingred();
	}

}