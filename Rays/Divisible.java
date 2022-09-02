 package com.Rays;

public class Divisible {
	public static void main(String[] args) {
		
	
/*int result=0;
for(int i=100;i<=200;i++) {
	if(i%7==0)
		result+=i;
}
System.out.println(result);
}
}*/
		int sum=0;
		for(int i =101; i<200;i++)
		{
			if(i%7==0) {
				sum=sum+i;
			}
		}
		System.out.println(sum);
		//System.out.println(count);
	}
}