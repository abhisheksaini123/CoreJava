package com.RaysTech;

public class TestShape1 {
public static void main(String[] args) {
	Shape1 s =new Shape1("blue",8);
	String col = s.getcolor();
	System.out.println("color:"+col);
	System.out.println("Borderwidth:"+s.getBorderwidth() );
}
}
