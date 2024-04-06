package que9;

class Account {
	protected String accNO;
	protected double bal;

	public Account(String accNO, double bal) {
		this.accNO = accNO;
		this.bal = bal;
	}

	public void deposit(double amt) {
		bal += amt;
	}

	public void withdraw(double amt) {
		if (bal >= amt) {
			bal -= amt;
		} else {
			System.out.println("Insufficient Fund...");
		}
	}

	public void accountDetails() {
		System.out.println("Account number: " + accNO);
		System.out.println("Balance: " + bal);
	}
}

class SavingAccount extends Account {
	private double Irate;

	public SavingAccount(String accNO, double bal, double Irate) {
		super(accNO, bal);
		this.Irate = Irate;
	}

	public double addInterest() {
		double interest = bal * (Irate / 100);
		bal += interest;
		return interest;
	}
}

class LoanAccount extends Account {
	private double loanAmt;

	public LoanAccount(String accNO, double bal, double loanAmt) {
		super(accNO, bal);
		this.loanAmt = loanAmt;
	}

	public void payEMI(double emi) {
		if (loanAmt >= emi) {
			loanAmt -= emi;
			System.out.println("EMI paid successfully.");
		} else {
			System.out.println("Insufficient loan amount to pay EMI.");
		}
	}
}

class HousingLoan extends LoanAccount {
	public HousingLoan(String accNO, double bal, double loanAmt, int tenure) {
		super(accNO, bal, loanAmt);
	}

	public void extendTenure(int yr) {
		System.out.println("Tenure extended successfully by " + yr + " years.");
	}

}
