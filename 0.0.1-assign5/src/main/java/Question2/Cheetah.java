package Question2;

public class Cheetah extends Animal {

	@Override
	String name() {
	System.out.println("Cheetah");
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
		Cheetah ch = new Cheetah();
		ch.name();
		ch.Class();
		System.out.println(ch.legs());		
		System.out.println(ch.teeth());
		
		
		
	}
}