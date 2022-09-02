package com.Rays;

public class Q8ArryTable {


public static void main(String[] args) {
	int[][]table = new int [11][11];
	for(int i=2;i<table.length; i++) {
		for(int j=1; j<table.length; j++);{
			table[i][i]=i*i;
			System.out.print(table[i][i]+" ");
}

}System.out.println();
}
}