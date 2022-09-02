package com.RaysTech;

public class Account {
private static final String Abhi = null;
private int balance;
private int accoundNumber;
private String amount;
private String  AccountHolder;
public void deposit(int amount) {
	balance=balance+amount;
}
public void Name(String AccountHolder, String Abhi) {
	Abhi=Abhi;
	
}
public void withdraw(int amount) {
	if(amount <= balance) {
		balance = balance-amount;
	}else 
		System.out.println("Insufficient balnce:");
	}

public int getbalnace() {
	return balance;
}
public void transfer(int amount, Account otherAccount) {
	otherAccount.deposit(amount);
	balance = balance - amount;
}
public void AccountHolderNmae(Account abhi2) {
	// TODO Auto-generated method stub
	
}

}


	


