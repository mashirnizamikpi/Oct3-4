package Employer;

public class Amit extends Employee{

	@Override
	String name() {
		System.out.println("Amit");
		// TODO Auto-generated method stub
		return "Amit";
	}

	@Override
	String State() {
		System.out.println("Haryana");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	int insurance() {
		System.out.println("1092736");
		// TODO Auto-generated method stub
		return 1092736;
	}

	@Override
	int salary() {
		
		// TODO Auto-generated method stub
		return 2000;
	}

	@Override
	String Father() {
		System.out.println("Akash");
		
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	String Mother() {
		System.out.println("Meenakshi");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	int Age() {
		System.out.println("22");
		// TODO Auto-generated method stub
		return 22;
	}

	@Override
	String Role() {
		System.out.println("SDE");
		// TODO Auto-generated method stub
		return null;
	}
	
	public static void main(String args[]) {
		Amit am= new Amit();
		am.name();
		am.State();
		am.insurance();
		am.salary();
		am.Father();
		am.Mother();
		am.Age();
		am.Role();
		
	}

}
