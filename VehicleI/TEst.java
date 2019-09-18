package VehicleI;

import java.util.ArrayList;
import java.util.List;

public class TEst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		Sedan s=new Sedan("disk",150);
		Sedan s1=new Sedan("combi",540);
		List<Sedan>list=new ArrayList() ;
		
		list.add(s);
		list.add(s1);
		
		
		for (Sedan sedan : list) {
			System.out.println(sedan);
			System.out.println(sedan.vehicleName()+" "+sedan.vehicleColor()+" "+sedan.cc());
		}
		
		Hatchback h=new Hatchback(4,123);

		Hatchback h1=new Hatchback(6,133);
	
		
		System.out.println("@@@@");
	List<Hatchback>lis	=new ArrayList<>();
		lis.add(h);
		lis.add(h1);
		
		for (Hatchback hatchback : lis) {
			System.out.println(hatchback);
			System.out.println(hatchback.vehicleName()+" "+hatchback.vehicleColor()+" "+hatchback.cc());
		}
		
	}

}
