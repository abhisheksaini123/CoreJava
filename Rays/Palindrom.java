package com.Rays;

public class Palindrom {
	public static void main(String[] args) {
		int number=3214;
		int r=0;
		int sum=0;
		int n=number;
		
		while (n>0) {
			r=n%10;
			sum=(sum*10+r);
			n=n/10;
		}
		if(sum==number) {
			System.out.println("palandrom"+ sum);
			
		}else {
			System.out.println("reverse number"+ sum);
		}
	}
	}

