	package com.Rays;

public class NumberDaimond {
	public static void main(String[] args) {
		int i,j,k;
		for(i=1;i<=5;i++)
		{
		for(j=i; j<5; j++) {
			System.out.print(" ");
		}
	for(k=1; k<(i*2);k++){
		System.out.print("5"); 
	}System.out.println();
		}
	for(i=4;i>=1;i--) {
		for(j=5;j>i;j--)
		{
			System.out.print(" ");
		}for(k=1;k<(i*2);k++) {
			System.out.print("4");
	}System.out.println();
	}
	}
	
	}


