package Question2;

public class Apple implements Food{

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
		System.out.println("1");
		
	}
	
	public static void main(String args[]) {
		Apple a=new Apple();
		a.taste();
		a.state();
		a.ingred();
	}

}
