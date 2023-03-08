package hotel;

public class customer {
	String name;
	int id;
	String mail;
	String loc;
	String adh;

	public customer(String name,int id,String mail, String loc,String adh) {
		
		this.name=name;
		this.id=id;
		this.mail=mail;
		this.loc=loc;
		this.adh=adh;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public String getAdh() {
		return adh;
	}

	public void setAdh(String adh) {
		this.adh = adh;
	}

	@Override
	public String toString() {
		return "customer [name=" + name + ", id=" + id + ", mail=" + mail + ", loc=" + loc + ", adh=" + adh + "]";
	}
    
	
}