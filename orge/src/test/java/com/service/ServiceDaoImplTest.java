package com.service;

import static org.junit.Assert.*;
import com.model.AcoountDaoImpl;
import org.junit.Before;
import org.junit.Test;

public class ServiceDaoImplTest {
	private static final String TEST_ACCOUNT_NO = "1234";
	private  ServiceDaoImpl service;
	
	@Before
	public void init() {
		service = new ServiceDaoImpl(new AcoountDaoImpl());
		service.createAccount(TEST_ACCOUNT_NO);
		service.deposit(TEST_ACCOUNT_NO, 100);
	}

	@Test
	public void testDeposit() {
		service.deposit(TEST_ACCOUNT_NO, 50);
		assertEquals(service.getBalance(TEST_ACCOUNT_NO),150,0);
		System.out.println("Balance is "+service.getBalance(TEST_ACCOUNT_NO));
	}

}
