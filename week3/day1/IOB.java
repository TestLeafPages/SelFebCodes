package week3.day1;

public class IOB implements RBI, IOBHO{

	public void homeLoanProcedure() {
		System.out.println("Home Loan IOB Implementation");
	}

	public void personalLoanProcedure() {
		System.out.println("Personal Loan IOB Implementation");
	}
	
	public void minBalanceFee() {
		System.out.println("10 %");
	}

	public static void main(String[] args) {
		IOB myBank = new IOB();
		myBank.homeLoanProcedure();
		myBank.personalLoanProcedure();
		myBank.minBalanceFee();
		
//		System.out.println(RBI.repoRate);
	}

	
	
	
	
	
	
	
	
	
	

}
