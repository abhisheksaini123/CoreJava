package com.Rays;

public class Pizza {
public static void main(String[] args) {
	int money = 98;
	if (money<100) {
		System.out.println("You can't buy Pizza");
	}else if (money>100 && money<300) {
		System.out.println("You can buy medium Pizza");
	}else {
		System.out.println("You can buy any Pizza");
	}
}
}
