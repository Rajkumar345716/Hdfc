package org.test;

import java.io.File;
import java.io.IOException;

public class HdfcBanking {
public static void main(String[] args) throws IOException {
	HdfcBankingApp h = new  HdfcBankingApp();
	h.readDataFromDb();
	h.setUsername("Raj");
	h.setPassword("Raj@14");
	String password = h.getPassword();
	h.setBalance(0);
	int balance = h.getBalance();
	System.out.println(balance);
	System.out.println("Test1");
}
}
