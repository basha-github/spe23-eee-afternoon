
public class ATM {

	public static void main(String[] args) {
	
		
		Account ramuAcc = new Account(123678,"Ramu",5000);
		
		ramuAcc.checkBalance();
		
		ramuAcc.deposit(23500);
		ramuAcc.checkBalance();
		
		ramuAcc.withDraw(13000);
		ramuAcc.checkBalance();
		
	}

}
