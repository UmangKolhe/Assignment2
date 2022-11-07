package com.assignment2;

public class quicksort {
	public static void quick(int[]a, int si ,int ei) {
		if(si>=ei) {
			return;
		}
	int pi =	quicksort1(a,si,ei);
	quick(a,si,pi-1);
	quick(a,pi+1,ei);
		
	}
	public static int quicksort1(int []a,int si,int ei) {
		int pivod = a[ei];
		int i =si-1;
		for(int j = si; j<ei; j++) {
			
			if(a[j]<=pivod) {
				i++;
				int temp = a[j];
				a[j]=a[i];
				a[i]=temp;
			}
			
		}
		i++;
		int temp=pivod;
		a[ei]=a[i];
		a[i]=temp;
		return i;
	}
	public static void print(int []a) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}

	public static void main(String[] args) {
		int[] a = {4,15,16,2,8,48,10};
		int si=0;
		int ei=a.length-1;
		quick(a,si,ei);
		print(a);

	}

}
