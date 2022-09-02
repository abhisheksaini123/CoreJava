package com.Rays;

public class Factorial {
public static void main(String[] args) {
	int a = 10;
	int result=1;
	for(int i=1; i<=a; i++) {
		result=result*i;
	}
System.out.println("The Factorial of"+" "+a+" "+"is"+" "+result);
}
}
