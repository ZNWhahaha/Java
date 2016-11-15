package com.znwhahaha.www;



public class Zuoye14_8 {
	static double area = 0;
	public static double sumArea(Geome1[] a){
		for(int i = 0;i < a.length; i++){
			area += a[i].getArea();
		}
		return area;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Geome1[] a = new Geome1[4];
		Circ1 a1 = new Circ1();
		a1.setRadius(1);  
		a[0] = a1;
		Circ1 a2 = new Circ1();
		a2.radius = 2;
		a[1] = a2;
		Pergream a3 = new Pergream();
		a3.setHigh(1);
		a3.setWidth(3);
		a[2] = a3;
		Pergream a4 = new Pergream();
		a4.setHigh(5);
		a4.setWidth(3);
		a[3] = a3;
		System.out.println(sumArea(a));
	}

}

abstract class Geome1 {
	abstract double getArea();
}

class Circ1 extends Geome1{
	double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getArea(){
		return Math.pow(radius, 2)*Math.PI;
	}
}

class Pergream extends Geome1{
	double high;
	double width;
	public double getHigh() {
		return high;
	}
	public void setHigh(double high) {
		this.high = high;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getArea(){
		return width * high;
	}
}