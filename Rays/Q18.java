package com.Rays;

public class Q18 {
public static void main(String[] args) {
	int[] a = {5,4,3,2,1};
	int b= 7;
	add(b,a);
	}
    public static void add(int b, int a[]) {
	  int p=0, s=0;
	  for(int i = 0; i<a.length; i++);{
	  if(b==a[s]){
		s=b;
		p++;
	}

if(p>0){
	System.out.println("Value exist="+s);
}else {
	System.out.println(-1);
}
}
}
}