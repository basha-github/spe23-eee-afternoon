
public class CinemaCounter {

	public static void main(String[] args) {
	
		Cinema devara = new Cinema("Devar",250,100);
		Cinema githanjali = new Cinema("Githanjali",100,50);
		Cinema sholay = new Cinema("Sholay",350,150);
		
		Account ramu = new Account(123567,"Ramu",5000);
		Account ramya = new Account(14597,"Ramya",10000);
		
		ramu.deposit(45000);
		
		bookings(devara,ramu,5);
		bookings(sholay,ramya,3);
		
		
		
		
	}

	private static void bookings(Cinema cinema, Account acc, int seats) {
		
		if(cinema.seats >seats ) {
			
			acc.withDraw(seats*cinema.price);
			
			cinema.seats = cinema.seats - seats;
			System.out.println(acc.name +" got tickets successfully..."+seats);
		}
	}

}
