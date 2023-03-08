package hotel;

public class hotelclass {
	String hotname;
	String loc;
	int budget;
	int id;
	public hotelclass(String hotname, String loc, int budget,int id) {
		
		this.hotname = hotname;
		this.loc = loc;
		this.budget = budget;
		this.id=id;
	}
	public String getHotname() {
		return hotname;
	}
	public void setHotname(String hotname) {
		this.hotname = hotname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public int getBudget() {
		return budget;
	}
	public int getId() {
		return id;
	}
	public void setBudget(int budget) {
		this.budget = budget;
	}
	public void setId(int budget) {
		this.id = budget;
	}
	@Override
	public String toString() {
		return "hotelclass [hotname=" + hotname + ", loc=" + loc + ", budget=" + budget + "]";
	}
    
}






