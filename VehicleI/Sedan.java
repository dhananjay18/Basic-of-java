package VehicleI;

public class Sedan implements Vehicle {

	String breakSystem;
	
	public Engine engine;
	public Sedan(String breakSystem,int performance)
	{
		this.breakSystem=breakSystem;
		
		engine=new Engine(performance);
	}
	public Sedan() {
		
		 
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String vehicleName() {
		// TODO Auto-generated method stub
		return "AUDI";
	}

	@Override
	public int cc() {
		// TODO Auto-generated method stub
		return 550;
	}

	@Override
	public String vehicleColor() {
		// TODO Auto-generated method stub
		return "RED";
	}
	@Override
	public String toString() {
		return "Sedan [breakSystem=" + breakSystem + ", engine=" + engine + "]";
	}

	
}
