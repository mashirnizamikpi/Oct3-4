package Employer;

public class Akash extends Employee{

	@Override
	String name() {
		System.out.println("Akash");
		// TODO Auto-generated method stub
		return "Akash";
	}

	@Override
	String State() {
		System.out.println("Mumbai");
		// TODO Auto-generated method stub
		return "Mumbai";
	}

	@Override
	int insurance() {
		System.out.println("1137392");
		// TODO Auto-generated method stub
		return 1137392;
	}

	@Override
	int salary() {
		
		// TODO Auto-generated method stub
		return 5000;
	}

	@Override
	String Father() {
		System.out.println("Abhay");
		
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	String Mother() {
		System.out.println("Meena");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	int Age() {
		System.out.println("25");
		// TODO Auto-generated method stub
		return 25;
	}

	@Override
	String Role() {
		System.out.println("SDE");
		// TODO Auto-generated method stub
		return null;
	}
	
	public static void main(String args[]) {
		Akash ak= new Akash();
		ak.name();
		ak.State();
		ak.insurance();
		ak.salary();
		ak.Father();
		ak.Mother();
		ak.Age();
		ak.Role();
		
	}

}
