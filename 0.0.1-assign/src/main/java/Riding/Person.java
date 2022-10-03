package Riding;

public class Person implements Swing,Glider {

	@Override
	public void start() {
		// TODO Auto-generated method stub
		Glider.super.Riding();
		Swing.super.Swinging();
	}
	public void run() {
		
	}
	
	public static void main(String args[]) {
		Person p= new Person();
		p.start();
		p.run();
		
	}

}
