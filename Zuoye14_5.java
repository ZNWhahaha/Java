package com.znwhahaha.www;


public class Zuoye14_5 {

	public static void main(String[] args) {
		GeometricObject a = new GeometricObject();
		GeometricObject b = new GeometricObject();
		a.radius = 1.0;
		b.radius = 1.0;
		System.out.println(a.equals(b));
	}

}

class GeometricObject extends Circle implements Comparable<Object>{
	
	@Override
	public int compareTo(Object o) {
		return 0;
	}
	@Override
	public  boolean equals(Object o){
		Circle p = (Circle)o;
		if (this.radius == p.radius) {
			return true;
		}
		return false;
	}
	
}