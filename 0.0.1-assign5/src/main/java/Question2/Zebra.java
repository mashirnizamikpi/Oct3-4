package Question2;

public class Zebra extends Animal {

	@Override
	String name() {
	System.out.println("Zebra");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	String Class() {
		System.out.println("Herbivores");
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
		Zebra z = new Zebra();
		z.name();
		z.Class();
		z.legs();
		z.teeth();
		
		
		
	}
}