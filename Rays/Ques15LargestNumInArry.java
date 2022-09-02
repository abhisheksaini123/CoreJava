package com.Rays;

public class Ques15LargestNumInArry {


public static void main(String[] args) {
	int [] a = {23, 45, 56, 79, 3, 6, 0};
	int b;
	for (int i = 0; i<a.length; i++) {
		for(int j = 0; j<a.length; j++) {
			if(a[i]>a[j]) {
				b=a[i];
				a[i] =a[j];
				a[j]=b;
			}
		}
		//System.out.println(a[i]+" ");
	}
	int lastelement = a[a.length-1]; 
	System.out.print("LastElement=");
	System.out.print(lastelement);
}
}
