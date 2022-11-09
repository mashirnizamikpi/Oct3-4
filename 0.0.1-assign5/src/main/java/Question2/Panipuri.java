package Question2;

public class Panipuri implements Food{

	public void taste() {
		// TODO Auto-generated method stub
		System.out.println("Best");
	}

	public void state() {
		// TODO Auto-generated method stub
		System.out.println("Delhi");
		
	}

	public void ingred() {
		// TODO Auto-generated method stub
		System.out.println("10");
		
	}
	
	public static void main(String args[]) {
		Panipuri pan=new Panipuri();
		pan.taste();
		pan.state();
		pan.ingred();
	}

}