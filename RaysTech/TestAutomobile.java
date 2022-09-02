package com.RaysTech;

public class TestAutomobile {
public static void main(String[] args) {
Automobile am=new Automobile();
am.setColor(null);
Automobile s =new Automobile();
s.setSpeed(60);
Automobile y = new Automobile();
y.setYear(2010);
Automobile m = new Automobile();
m.getMake();
System.out.println(am.getColor());
System.out.println(s.getSpeed());
System.out.println(y.getYear());
System.out.println(m.getMake());
}
}
