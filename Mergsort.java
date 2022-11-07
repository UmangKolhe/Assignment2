package com.assignment2;

public class Mergsort {
	public static void merg(int []a,int si,int ei) {
		if(si>=ei) {
			return;
		}
		int mid = si+(ei-si)/2;
		merg(a,si,mid);
		merg(a,mid+1,ei);
		mergsort(a,si,mid,ei);
		
	}
	public static void mergsort(int[]a,int si,int mid,int ei) {
		int [] temp = new int[ei-si+1];
		int i =si;
		int j =mid+1;
		int k=0;
		
		while(i<=mid && j<=ei) {
			if(a[i]<a[j]) {
				temp[k]=a[i];
				i++;
			}
			else {
				temp[k]=a[j];
						j++;
			}
			k++;
			
		}
		while(i<=mid) {
			temp[k++]=a[i++];
		}
		while(j<=ei) {
			temp[k++]=a[j++];
		}
		for(i=si,k=0; k<temp.length; i++,k++) {
			a[i]=temp[k];
		}
	}
	public static void print(int[]a) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}

	public static void main(String[] args) {
		int [] a = {10,8,15,4,17,2};
		int si=0;
		int ei=a.length-1;
		merg(a,si,ei);
		print(a);

	}

}
