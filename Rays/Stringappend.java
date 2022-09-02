package com.Rays;

public class Stringappend {
public static void main(String[] args) {
	String s="Hello world of good people";
	char c='l';
	int count=0;
	for(int i=0; i<s.length();i++) {
		if(c==s.charAt(i)) {
			count++;
			System.out.println(count);
		}
	}
}
}
