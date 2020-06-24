package AulasUdemyJava.classesmetodosfinal;

public class Program {

	public static void main(String[] args) {

		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		//sobrescrita de métodos
		Account acc1 = new Account(1001, "Mauroslucios", 10000.00);
		acc1.withdraw(200.00);
		System.out.println(acc1.getBalance());
		
		//sobrescrita de métodos
		Account accev = new SavingsAccount(1000, "Everton", 1000.0, 0.01);
		accev.withdraw(200);
		System.out.println(accev.getBalance());
		
		//sobrescrita de métodos usando o super
		Account accet = new BusinessAccount(999, "Ethelin", 1000.00,500.0);
		accet.withdraw(200);
		System.out.println(accet.getBalance());
		
		//UPCASTING
		acc = bacc;
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
		
		//DOWNCASTING
		
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(100.0);
		
		// BusinessAccount acc5 = (BusinessAccount)acc3;
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
	}
}