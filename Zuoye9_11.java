package com.znwhahaha.www;

import java.util.Arrays;
import java.util.Scanner;

public class Zuoye9_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("ÊäÈëÒ»´®×Ö·û´®");
		String arr = input.next();
		char ch[]=arr.toCharArray();
		Arrays.sort(ch);
		System.out.println("ÅÅĞòºóµÄ×Ö·û´®Îª\n" + new String(ch) );
		input.close();
	}
}
