package Question2;

public class Kangaroo extends Animal {

	@Override
	String name() {
	System.out.println("Kangaroo");
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
		Kangaroo ka = new Kangaroo();
		ka.name();
		ka.Class();
		System.out.println(ka.legs());		
		System.out.println(ka.teeth());
		
		
		
	}
}