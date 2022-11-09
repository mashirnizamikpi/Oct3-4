package Question2;

public class Lion extends Animal {

	@Override
	String name() {
	System.out.println("Lion");
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
		return 0;
	}

	@Override
	int teeth() {
		// TODO Auto-generated method stub
		return 0;
	}

	public static void main(String args[]) {
		Lion l = new Lion();
		l.name();
		l.Class();
		l.legs();
		l.teeth();
		
		
		
	}
}
