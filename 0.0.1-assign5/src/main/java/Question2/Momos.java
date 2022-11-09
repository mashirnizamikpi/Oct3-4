package Question2;

public class Momos implements Food{

	public void taste() {
		// TODO Auto-generated method stub
		System.out.println("Good");
	}

	public void state() {
		// TODO Auto-generated method stub
		System.out.println("Delhi");
		
	}

	public void ingred() {
		// TODO Auto-generated method stub
		System.out.println("4");
		
	}
	
	public static void main(String args[]) {
		Momos mo=new Momos();
		mo.taste();
		mo.state();
		mo.ingred();
	}

}