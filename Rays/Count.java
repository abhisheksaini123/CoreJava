package com.Rays;

public class Count {
	public static void main(String[] args) {
		String name="vijay dinanath chouhan";
		char ch=0;
		for (int i=0;i<name.length();i++){
			ch = name.charAt(i);
			int count=0;
			for (int j=0;j<name.length();j++) {
				if (ch==name.charAt(j)) {
					count++;
				}
			}
			System.out.println(ch+" "+count);
		}
	}

}
