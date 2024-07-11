package org.test;
import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.commons.io.FileUtils;

public class HdfcBankingApp {
	Map<String, Integer> m;
	private String username;
	private String password;
	private int balance;

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		if (username.equals("Raj")) {
			this.username = "Raj Account";
		} 
		else if (username.equals("Vijay")) {
			this.username = "Vijay Account";
		}
		else if (username.equals("Seenu")) {
			this.username = "Seenu Account";
		}
		else {
			this.username = "Invalid Account";
		}

	}


	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		if (password.equals("Raj@14") && username.equals("Raj Account")) {
			this.password = "Raj Account Is Validated";
		}
		else if (password.equals("Vijay@14")&& username.equals("Vijay Account")) {
			this.password = "Vijay Account Is Validated";
		}
		else if (password.equals("Seenu@14")&& username.equals("Seenu Account")) {
			this.password = "Seenu Account Is Validated";
		}
		else {
			this.password = "Invalid Account";
		}
	}
	public int getBalance() {
		return balance;
	}

	
	

	public void setBalance(int balance) {
	Set<Entry<String, Integer>> entrySet = m.entrySet();
	for (Entry<String, Integer> entry : entrySet) {
		if (this.password.equals(entry.getKey()) ){
			this.balance = entry.getValue();
			System.out.println(m);
		}
	}

}

	public void readDataFromDb() throws IOException {
		
	File f = new File("C:\\Users\\Admin\\eclipse-workspace\\Hdfc\\Input Data\\EmpDetails.txt");
	List<String> readLines = FileUtils.readLines(f);
		
	m = new LinkedHashMap();	
		
		String string = readLines.get(0);
		String[] split = string.split(",");
		
		m.put("Raj Account Is Validated", Integer.parseInt(split[2]));
	
		String string2 = readLines.get(1);
		String[] split2 = string.split(",");
		m.put("Vijay Account Is Validated", Integer.parseInt(split2[2]));
		
		String string3 = readLines.get(2);
		String[] split3 = string.split(",");
	m.put("Seenu Account Is Validated", Integer.parseInt(split3[2]));
		
	}
}
