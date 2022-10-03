package Pens;

public class Student implements Pen,Pencil {

	public void Pname() {
		// TODO Auto-generated method stub
		System.out.println("Apsara");
		
	}

	public void Pcategory() {
		// TODO Auto-generated method stub
		System.out.println("Pencil");
		
	}

	public void Pcost() {
		// TODO Auto-generated method stub
		System.out.println("50");
	}

	public void Penname() {
		// TODO Auto-generated method stub
		System.out.println("Trimax");
	}

	public void Penbrand() {
		// TODO Auto-generated method stub
		System.out.println("Reynolds");
	}

	public void Pencategory() {
		// TODO Auto-generated method stub
		System.out.println("Gel Pen");
		
	}

	public void Penprice() {
		// TODO Auto-generated method stub
		System.out.println("Rs.150");
		
	}
	
	public static void main(String[] args)

	{
		Student s = new Student();
	   
	    s.Pname();
	    s.Pcategory();
	    s.Pcost();
	    s.Penname();
	    s.Pencategory();
	    s.Penprice();
	    
	    
	}	

}
