package Pens;

public class Teacher implements Pen,Pencil {

	public void Pname() {
		// TODO Auto-generated method stub
		System.out.println("Nataraj");
		
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
		System.out.println("Parker");
	}

	public void Penbrand() {
		// TODO Auto-generated method stub
		System.out.println("Parker");
	}

	public void Pencategory() {
		// TODO Auto-generated method stub
		System.out.println("Gel Pen");
		
	}

	public void Penprice() {
		// TODO Auto-generated method stub
		System.out.println("Rs.1000");
		
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
