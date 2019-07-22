package com.model;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class AcoountDaoImpl implements IAccountDao {
	
	private Map<String,Account> accounts;
	
	public AcoountDaoImpl() {
		accounts = Collections.synchronizedMap(new HashMap<String, Account>());
	}

	public boolean accountExists(String accountNo) {
		return accounts.containsKey(accountNo);
	}
	public void createAccount(Account account) {
		if(accountExists(account.getNumber())) {
			throw new RuntimeException();
		}
		accounts.put(account.getNumber(), account);
	}

	public void updateAccount(Account account) {
		if(!accountExists(account.getNumber())) {
			throw new RuntimeException();
		}
		accounts.put(account.getNumber(),account);

	}
	public Account findAccount(String acountNumber) {
		Account account = accounts.get(acountNumber);
		if(account == null) {
			throw new RuntimeException();
		}
		return account;
	}

}
