package com.JavaBasic;

import java.util.Arrays;

public class SarowerVai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] k = {1,2,3,4,5,6};
		int [] l = {7,8,9,10};
		
		int [] m = new int[k.length+l.length];
		
		//System.arraycopy(k, 0, l, k.length-1, k.length+l.length);
		
		int [] c = {10,20,20,30,40,40,50,60,70,70,80,90,100};
		
		int [] distinct = null;
		
		for(int i=0; i<c.length; i++) {
			System.out.print(" "+c[i]);
			for(int j=1; j<c.length; j++) {
				if(c[i]==c[j]) {
					distinct [i] = c[j];
				}
			}
		}
		
		
		
		/*
		
		for(int i : c) {
			System.out.print(" "+i);
		}
		
		
		int [] b = {10,20,30,40,50};
		
		System.out.println(Arrays.toString(b));
		
		for(int i : b) {
			System.out.print(i);
		}
		
		
		
		int x= 0;
		
		String cn = "United States of America";
		
		for(int j=cn.length()-1; j>=0; j-- ) {
			
			System.out.println(cn.charAt(j));
			
		}
		
		
		StringBuffer rev=new StringBuffer(cn).reverse();
		
		
		
		System.out.println(rev);
		
		int a = 0;
		
		for (int i=0; i<cn.length(); i++ ) {
			
			if(cn.charAt(i)=='a') {	 
			 System.out.println(cn.charAt(i));
			 a = a+1;
			}
			
		}
		
		System.out.println("Number of occurance of a is :"+a);
		
		
		String country= "United States of America";
		
		for(int i=country.length()-1; i>=0;  i--) {
			System.out.print(country.charAt(i));
		}
		
		
		String reverse = new StringBuffer(country).reverse().toString();
		System.out.print(reverse);
		
		
		 * for(int i=0; i<=50; i++) { System.out.print(" "+i); } System.out.println();
		 * for(int i=50; i>=0; i--) { System.out.print(" "+i); }
	*/	 

	}


}
