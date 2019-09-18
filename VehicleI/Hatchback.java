package VehicleI;

public class Hatchback implements Vehicle {

	public int seat;

	public Engine engine;
	public Hatchback(int seat,int performance) {
	
		this.seat=seat;
		 engine=new Engine(performance);
		
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String vehicleName() {
		// TODO Auto-generated method stub
		return "SUZUKI";
	}

	@Override
	public int cc() {
		// TODO Auto-generated method stub
		return 650;
	}

	@Override
	public String vehicleColor() {
		// TODO Auto-generated method stub
		return "BLACK";
	}

	@Override
	public String toString() {
		return "Hatchback [seat=" + seat + ", engine=" + engine + "]";
	}

}
