package com.znwhahaha.www;

public class Zuoye14_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComparableCircle a = new ComparableCircle();
		a.radius = 1;
		ComparableCircle b = new ComparableCircle();
		b.radius = 2;
		System.out.println(b.compareTo(a));
	}

}
class Circle{
	double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea(double radius){
		return Math.pow(radius, 2)*Math.PI;
	}
}

class ComparableCircle extends Circle implements Comparable<Object>{

	@Override
	public int compareTo(Object o) {
		Circle p = (Circle)o;
		if(this.getArea(this.radius)>p.getArea(p.radius))
			return 1;
		else if(this.getArea(this.radius) == p.getArea(p.radius))
			return 0;
		else {
			return -1;
		}
	}
}