package salary;

public class Money {
	String id;
	String name;
	double salary;
	public Money(String id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Money [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
//	public double compareTo(Money m) {
//		return this.salary - m.salary;
//	}

}
