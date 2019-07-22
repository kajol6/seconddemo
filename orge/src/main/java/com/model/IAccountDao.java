package com.model;

public interface IAccountDao {
	
	public void createAccount(Account accountNumber) ;
	public void updateAccount(Account accountNumber);
	public Account findAccount(String acountNumber);

}
