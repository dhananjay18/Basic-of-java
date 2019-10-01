package string;

import java.util.Date;

public class Section {
	private int id;
	private String name;
	private String Date;
	public int getId() {
		return id;
	}
	public int setId(int id) {
		return this.id = id;
	}
	public String getName() {
		return name;
	}
	public String setName(String name) {
		return this.name = name;
	}

	public String showDetails()
	{


		return "ID:"+getId()+ " name:"+getName()+" Date:"+getDate();
	}
	public String getDate() {
		return Date;
	}
	public String setDate(String date) {
		return Date = date;
	}

}
