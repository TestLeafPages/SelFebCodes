package week3.day1;

public class SBI implements RBI{

	public void homeLoanProcedure() {
		System.out.println("Home Load Implementation");
	}

	public void personalLoanProcedure() {
		System.out.println("Personal Loan Implementation");
	}
	
	public void specialITLoan() {
		System.out.println("Loan for IT Engineers");
	}

	public static void main(String[] args) {

		RBI myBank = new SBI(); 
		myBank.homeLoanProcedure();
		myBank.personalLoanProcedure();
//		myBank.specialITLoan();

//		RBI myBank = new RBI();

	}

















}