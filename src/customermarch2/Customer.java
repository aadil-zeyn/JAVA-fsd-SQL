package customermarch2;

public class Customer {
   int Regid;
   String name;
   String location;
   String email;
   String phoneno;
public Customer(int regid, String name, String location, String email, String phoneno) {
	super();
	Regid = regid;
	this.name = name;
	this.location = location;
	this.email = email;
	this.phoneno = phoneno;
}
public int getRegid() {
	return Regid;
}
public void setRegid(int regid) {
	Regid = regid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhoneno() {
	return phoneno;
}
public void setPhoneno(String phoneno) {
	this.phoneno = phoneno;
}
@Override
public String toString() {
	return "Hotel [Regid=" + Regid + ", name=" + name + ", location=" + location + ", email=" + email + ", phoneno="
			+ phoneno + "]";
}
   
}
