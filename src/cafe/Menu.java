package cafe;

public class Menu {
	private String items;
	private int prize;
	private int id;
	public Menu(String items, int prize, int id) {
		super();
		this.items = items;
		this.prize = prize;
		this.id = id;
	}
	public String getItems() {
		return items;
	}
	public void setItems(String items) {
		this.items = items;
	}
	public int getPrize() {
		return prize;
	}
	public void setPrize(int prize) {
		this.prize = prize;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Menu [items=" + items + ", prize=" + prize + ", id=" + id + "]";
	}
	
	
}
