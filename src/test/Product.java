package test;

public class Product{
	int id;
	String name;
	double prize;
	public Product(int id, String name, double prize) {
		
		this.id = id;
		this.name = name;
		this.prize = prize;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrize() {
		return prize;
	}
	public void setPrize(double prize) {
		this.prize = prize;
	}
	public String toString() {
		return ("ID :"+id+",Prize :"+prize+" Name :"+name);
	}
	
	
}
