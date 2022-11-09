package Question2;

public class Panther extends Animal {

	@Override
	String name() {
	System.out.println("Panther");
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
		return 44;
	}

	public static void main(String args[]) {
		Panther p = new Panther();
		p.name();
		p.Class();
		p.legs();
		p.teeth();
		
		
		
	}
}