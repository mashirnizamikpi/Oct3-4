package Question2;

public class Tiger extends Animal {

	@Override
	String name() {
	System.out.println("Tiger");
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
		return 40;
	}

	public static void main(String args[]) {
		Tiger t = new Tiger();
		t.name();
		t.Class();
		System.out.println(t.legs());		
		System.out.println(t.teeth());
		
		
		
	}
}