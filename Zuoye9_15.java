package com.znwhahaha.www;

import java.util.Scanner;

public class Zuoye9_15 {

	public static void main(String[] args) {
		int sum = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("�������ַ���");
		String arg = input.nextLine();
		for(int i = 0; i < args.length; i++){
			if (arg.charAt(i) >= 'A' && arg.charAt(i) <= 'Z') {
				sum++;
			}
		}
		System.out.println("�ַ����д�д��ĸ�ĸ���Ϊ��" + sum);
		input.close();
	}

}
