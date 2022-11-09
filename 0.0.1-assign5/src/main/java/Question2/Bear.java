package Question2;

public class Bear extends Animal {

	@Override
	String name() {
	System.out.println("Bear");
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
		Bear be = new Bear();
		be.name();
		be.Class();
		be.legs();
		be.teeth();
		
		
		
	}
}