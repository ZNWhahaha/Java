package com.znwhahaha.www;

import java.util.Random;

public class Zuoye8_4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random(1000);
		for(int i = 1;i <= 50; i++){
		System.out.print(random.nextInt(100) + " ");
		}
	}
}
