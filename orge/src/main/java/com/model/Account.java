package com.model;

public class Account {
	String bank_number;
	int balance;
	
	public Account(int balance,String bank_number)
	{
		this.balance = balance;
		this.bank_number = bank_number;
	}
	
	String getNumber() {
		return bank_number;
	}
	
	void setNumber(String number) {
		bank_number = number;
	}
	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}

}
