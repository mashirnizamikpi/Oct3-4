package Question6;

import java.util.ArrayList;

public class India {

	
	public static String start() {
			
			//when we using list for  duplication
		ArrayList<String> No = new ArrayList<String>();
		No.add("Delhi");
		No.add("Punjab");
		No.add("Haryana");
		No.add("Rajasthan");
		No.add("Mumbai");
		No.add("UP");
		No.add("Chandigarh");
		
		
		
		ArrayList<String> Ne = new ArrayList<String>();
		Ne.add("Meghalaya");
		Ne.add("Mizoram");
		Ne.add("Mumbai");
		Ne.add("Assam");
		Ne.add("Arunachal");
		Ne.add("Mumbai");
		
		
		ArrayList<String> so = new ArrayList<String>();
		so.add("Mumbai");
		so.add("Karnataka");
		so.add("Kerala");
		so.add("Telangana");
		so.add("Lakshadweep");
		so.add("Andaman");
		
		
		ArrayList<String> ea = new ArrayList<String>();
		ea.add("Bihar");
		ea.add("Mumbai");
		ea.add("Odisha");
		ea.add("Jharkhand");
		ea.add("Kolkata");

		
		
		ArrayList<String> we = new ArrayList<String>();
		we.add("Mumbai");
		we.add("Maharashtra");
		we.add("Gujarat");
		we.add("Rajasthan");
		we.add("Goa");
		
		
		System.out.println(No);
		System.out.println(Ne);
		System.out.println(so);
		System.out.println(ea);
		System.out.println(we);
	
		
		for (int i = 0; i < No.size(); i++) {
			for(int j = 0; j < Ne.size(); j++){
				for(int k = 0; k < so.size(); k++) {
					for(int l = 0; l < ea.size(); l++) {
						for(int m = 0; m < we.size(); m++) {
					
			if (No.get(i) == Ne.get(j)) {
				
				if (Ne.get(j) == so.get(k)){
					
					if (so.get(k) == ea.get(l)){
						
						if (ea.get(l) == we.get(m)) {
					
					
					
				System.out.println("Same state at all array index");	
				System.out.println(i);
				System.out.println(j);
				System.out.println(k);
				System.out.println(l);
				System.out.println(m);
				
				
				
					
		}
}
					}
				}
			}
						}
					}
				}
			}
		 for (int j = 0; j < Ne.size(); j++)
		{
			 return (Ne.get(j));
		}



	
		return null;
		
		}
			
		
		}
				
				
				
			
		
		

				
			
				
		
		
	
	

		


