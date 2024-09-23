
public class Cinema {
	
	String name;
	int price;
	int seats;
	public Cinema(String name, int price, int seats) {
		super();
		this.name = name;
		this.price = price;
		this.seats = seats;
	}
	@Override
	public String toString() {
		return "Cinema [name=" + name + ", price=" + price + ", seats=" + seats + "]";
	}
	
	
	
	
	

}
