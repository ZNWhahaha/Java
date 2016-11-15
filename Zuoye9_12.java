package com.znwhahaha.www;

import java.util.Arrays;
import java.util.Scanner;

public class Zuoye9_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("输入两个字符串，以回车间隔：");
		String s1 = input.nextLine();
		String s2 = input.nextLine();
		if(new compare().isAnagram(s1, s2)){
			System.out.println("anagram");
		}
		else {
			System.out.println("not anagram");
		}
		input.close();
	}
}
class compare{
	public static boolean isAnagram(String s1,String s2){
		char ch1[]=s1.toCharArray();
		Arrays.sort(ch1);
		char ch2[]=s2.toCharArray();
		Arrays.sort(ch2);
		if(ch1.length != ch2.length){
			return false;
		}
		for(int i = 0;i < ch1.length; i++){
			if (ch1[i] != ch2[i]) {
				return false;
			}
		}
		return true;
	}
}
