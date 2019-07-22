package com.service;
import com.model.Account;
import com.model.AcoountDaoImpl;

public class ServiceDaoImpl implements IServiceDao {

	private AcoountDaoImpl accountdaoimpl;
	
	public ServiceDaoImpl(AcoountDaoImpl accountdaoimpl) {
		this.accountdaoimpl = accountdaoimpl;
	}
	
	public void createAccount(String accountNo) {
		accountdaoimpl.createAccount(new Account(0,accountNo));
	}

	public void deposit(String accountNumber,int amount) {
		Account account = accountdaoimpl.findAccount(accountNumber);
		account.setBalance(account.getBalance() + amount);
		accountdaoimpl.updateAccount(account);
	}

	public int getBalance(String accountNo) {
		
		return accountdaoimpl.findAccount(accountNo).getBalance();
	}
}
