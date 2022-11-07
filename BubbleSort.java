package com.assignment2;

public class BubbleSort {
	public static void sort(int []a) {
		for(int i =0; i<a.length-1;i++) {
			for(int j =0;j<a.length-1-i;j++) {
				if(a[j]>a[j+1]) {
					int temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
				
			}
		}
		
	}
	public static void print1(int [] a) {
		for(int i=0 ; i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}

	public static void main(String[] args) {
		int [] a = {12,6,15,25,17,4};
		sort(a);
		print1(a);

	}

}
