package com.RaysTech;

public class Automobile {
private String color;
private int year;
private String make;
private int speed;
public void Car() {
make="Thar";
year = 0;
color="";
speed = 0;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public String getMake() {
	return make;
}
public void setMake(String make) {
	this.make = make;
}
public int getSpeed() {
	return speed;
}
public void setSpeed(int speed) {
	this.speed = speed;
}
public void Accelerate() {
	if (year<2010) {
		speed+=50;
	}else if (year>=2010) {
		speed+=40;
	}
	
}
public void Break() {
	if (year<2010) {
		speed-=5;
	}
	else if (year>2010) {
		speed-=10;
	}
	if(speed<=0) {
		speed=0;
	}
	}
public void stop(){
	speed=0;
}
}

