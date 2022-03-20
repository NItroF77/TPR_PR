package Composition;

import java.util.List;

public class Bank {
	private final List<SavingAccount> accounts;
	Bank(List<SavingAccount> SavingAccounts){
		this.accounts = SavingAccounts;
	}
	public List<SavingAccount> getTotalAccountInBank(){
		return accounts;
	}
}
