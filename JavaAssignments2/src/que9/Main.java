package que9;

 class Main {

	public static void main(String[] args) {
		SavingAccount sa = new SavingAccount("1", 10, 2.0);
		sa.accountDetails();
		sa.deposit(22.2);
		sa.accountDetails();
		sa.addInterest();
		sa.accountDetails();

		System.out.println();

		HousingLoan hl = new HousingLoan("201", 10.0, 500000, 20);
		hl.accountDetails();
		hl.payEMI(10000);
		hl.accountDetails();
		hl.extendTenure(5);
		hl.accountDetails();

	}

}
