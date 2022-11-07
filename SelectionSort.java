package com.assignment2;

public class SelectionSort {
	public static void select(int [] a) {
		for(int i=0;i<a.length;i++) {
			int min =i;
			for(int j =i+1;j<a.length;j++) {
				if(a[min]>a[j]) {
					min = j;
				}
			}
			int temp = a[min];
			a[min] = a[i];
			a[i] = temp;
		}
	}
	public static void print(int [] a) {
		for(int i = 0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}

	public static void main(String[] args) {
		int [] a = {12,16,4,5,10,17};
		select(a);
		print(a);

	}

}
