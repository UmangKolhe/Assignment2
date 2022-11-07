package com.assignment2;

public class CheckSUBset {
	public static boolean subset(int [] a, int []b) {
		for(int i =0; i<a.length; i++) {
			System.out.println(a[i]+"this element is geting serched");
			a:for(int j =0 ; j<b.length; j++) {
				if(a[i] == b[j]) {
					System.out.println(a[i]+"fpond at"+j);
					break a;
				}
				if(j==b.length-1) {
					System.out.println(a[j]+"= this element is not present hence a is not  sub set of b");
					return false;
				}
			}
		 
		}
		return true;
	}

	public static void main(String[] args) {
		
		int a [] = {10,12,14};
		int b [] = {10,12,14,16};
		
		System.out.println("hence the ans is = "+subset(a,b));
	
	}
}
