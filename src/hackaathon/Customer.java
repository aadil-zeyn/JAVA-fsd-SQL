package hackaathon;

public class Customer {
	private int custid;
	String name;
	String mailid;

	public Customer(int custid, String name, String mailid) {
		super();
		this.custid = custid;
		this.name = name;
		this.mailid = mailid;
	}

	public int getCustid() {
		return custid;
	}

	public void setCustid(int custid) {
		this.custid = custid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMailid() {
		return mailid;
	}

	public void setMailid(String mailid) {
		this.mailid = mailid;
	}

}
