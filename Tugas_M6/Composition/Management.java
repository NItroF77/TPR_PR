package Composition;

import java.util.ArrayList;
import java.util.List;

public class Management {
	public static void main(String[] args) {
		SavingAccount a1 = new SavingAccount("Fer",1000);
		SavingAccount a2 = new SavingAccount("Zed",278);
		SavingAccount a3 = new SavingAccount("Raze",500);
		List<SavingAccount> Accounts = new ArrayList<SavingAccount>();
		Accounts.add(a1);
		Accounts.add(a2);
		Accounts.add(a3);
		Bank Bank = new Bank(Accounts);
		List<SavingAccount> accs = Bank.getTotalAccountInBank();
		for(SavingAccount acc : accs ) {
			System.out.println("name	: " + acc.name);
			System.out.println("savings : "+acc.savings);
		}
	}
}
