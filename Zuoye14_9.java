package com.znwhahaha.www;

import java.util.Date;

public class Zuoye14_9 {
	   public static Object max(Comparable<Object>[] oba){
	        Object m = oba[0];
	        for (int i = 0; i < oba.length ;i++){
	            if (oba[i].compareTo(m) >= 0){
	                m = oba[i];
	            }
	        }
	        return m;
	    }
	    public static void main(String[] args){
	        System.out.println(max(new String[]{"a","aa","aaa"}));
	        System.out.println(max(new Date[] {new Date() , new Date(22L),new Date(10999L)}));
	        System.out.println(max(new Integer[]{2, 3, 5, 12, 4, 8, 9, 2}));
	    }
}