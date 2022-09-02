package com.RaysTech;

public class Shape1 {
	public String color;
private int borderwidth;
public static final float PI = 3.1f;
public Shape1() {
	System.out.println("Shape");
}
public Shape1(String c ,int b) {
	color=c;
	borderwidth = b;
}
public String getcolor() {
	return color;
}
public int getBorderwidth() {
	return borderwidth;
}
}
