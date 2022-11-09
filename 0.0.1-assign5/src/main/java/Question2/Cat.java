package Question2;

public class Cat extends Animal {

	@Override
	String name() {
	System.out.println("Cat");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	String Class() {
		System.out.println("Carnivores");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	int legs() {
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	int teeth() {
		// TODO Auto-generated method stub
		return 28;
	}

	public static void main(String args[]) {
		Cat ca = new Cat();
		ca.name();
		ca.Class();
		ca.legs();
		ca.teeth();
		
		
		
	}
}