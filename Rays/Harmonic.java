package com.Rays;

public class Harmonic {
public static void main(String[] args) {
	int num=8;
	double result=0.0;
	System.out.println("The Harmonic series is");
	while (num>0) {
		result=result + (double) 1/num;
		num--;
		System.out.println(result+",");
	}
}
}
