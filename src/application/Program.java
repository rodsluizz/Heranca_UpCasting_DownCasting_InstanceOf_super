package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		Account acc = new Account(2452, "Rodrigo Cunha", 500.00);
		BusinessAccount bacc = new BusinessAccount(1002, "Fernanda Cristiny", 700.0, 5000.00);
		
		//UPCASTING
		
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1005, "Ana Luiza", 1000.00, 15000.00);
		Account acc3 = new SavingsAccount(1006, "Denise Cristina", 2000.00, 10.00);
		
		//DOWNCASTING

		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc4 = (SavingsAccount)acc3;
			acc4.upDateBalance(300.0);
		}
		
		if(acc2 instanceof BusinessAccount) {
			BusinessAccount bacc5 = (BusinessAccount)acc2;
			bacc5.loan(500);
			System.out.println(bacc5.getBalance());
		}
		
		Account acc5 = new BusinessAccount(2000, "Emicida", 1000.0, 100000.0);
		acc5.withDraw(100.0);
		System.out.println(acc5.getBalance());
		
	}

}
