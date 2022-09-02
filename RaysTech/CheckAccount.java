package com.RaysTech;

public class CheckAccount {


public static void main(String[] args) {
	Account acc = new Account();
	acc.deposit(2000);
	Account abhi = new Account();
	abhi.deposit(3000);
	Account Abhi = new Account();
	
	acc.transfer(1000, abhi);
	System.out.println(acc.getbalnace());
	System.out.println(abhi.getbalnace());
	
}


}
