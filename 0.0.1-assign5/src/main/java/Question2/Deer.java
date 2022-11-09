package Question2;

public class Deer extends Animal {

	@Override
	String name() {
	System.out.println("Deer");
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
		return 40;
	}

	public static void main(String args[]) {
		Deer d = new Deer();
		d.name();
		d.Class();
		d.legs();
		d.teeth();
		
		
		
	}
}