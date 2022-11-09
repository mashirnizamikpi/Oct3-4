package Question2;

public class Dog extends Animal {

	@Override
	String name() {
	System.out.println("Dog");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	String Class() {
		System.out.println("Omnivores");
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
		return 40;
	}

	public static void main(String args[]) {
		Dog dg = new Dog();
		dg.name();
		dg.Class();
		System.out.println(dg.legs());		
		System.out.println(dg.teeth());
		
		
		
	}
}