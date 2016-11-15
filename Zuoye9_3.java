package com.znwhahaha.www;

import java.util.Scanner;

public class Zuoye9_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入要设置的密码：");
		String arg = input.nextLine();
		new password().Find_password(arg);
		input.close();
	}
}

class password{
	public static void Find_password(String arg){
		int flag = 1,num = 0;
		if (arg.length() < 8) {
			flag = 0;
		}
		for(int i = 0; i < arg.length(); i++){
			if(!((arg.charAt(i) >= '0' && arg.charAt(i) <= '9') || (arg.charAt(i)>='a' && arg.charAt(i)<='z')
					|| arg.charAt(i)>='A' && arg.charAt(i)<='Z')){
				flag = 0;
			}
			else if (arg.charAt(i) >= '0' && arg.charAt(i) <= '9') {
				num++;
			}
		}
		if (num < 2) {
			flag = 0;
		}
		if (flag == 1) {
			System.out.println("Valid Password");
		}
		else {
			System.out.println("Invalid Password");
		}
	}
}