package cafe;

public class Customer {
    private int UID;
    private String name;
	public Customer(int uID, String name) {
		super();
		UID = uID;
		this.name = name;
	}
	public int getUID() {
		return UID;
	}
	public void setUID(int uID) {
		UID = uID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Customer [UID=" + UID + ", name=" + name + "]";
	}
    
}
