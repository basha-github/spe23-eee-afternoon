
public class Account {
	
	
	int accNo;
	String name;
	int balance;
	
	public Account(int accNo, String name, int balance) {
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
		
		System.out.println(accNo +" got created with name "+name
				+" haveing opening balance "+balance);
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", name=" + name + ", balance=" + balance + "]";
	}
	
	
	void deposit(int amt) {
		this.balance = this.balance + amt;
		System.out.println("Successfully deposited "+amt);
	}
	
	
	
	void withDraw(int amt) {
		this.balance = this.balance - amt;
		System.out.println("Successfully withDrawn "+amt);
	}

	void checkBalance() {
		
		System.out.println("Ava balance......"+this.balance);
	}

}
