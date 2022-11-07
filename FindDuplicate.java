package com.assignment2;

public class FindDuplicate {
	public static boolean dupli(int a []) {
		for(int i =0;i<a.length;i++) {
			for(int j =i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println("duplicate element = "+a[i]);
					return true;
				}
				
			}
		}
		return false;
	}
	 

	public static void main(String[] args) {
		int [] a = {2,4,5,6,8,10,5};
		System.out.println(dupli(a));
	

	}

}
