package com.algorithms;

public class SelectionSort {
	
	public static void sort(int[] a) {
		
		int n=a.length;
	
		
		//Step 1: Select the smallest element
		for (int i=0;i<n-1;i++) {
			int min=i;  //smallest assume
			
			//compare with the remaining elements
			for(int j=min+1;j<n;j++) {
				if(a[min]>a[j]) {
					min=j;
				}
			}
			
			//swap with the minimum
			if(a[min]!=a[i]) {
				int temp=a[i];
				a[i]=a[min];
				a[min]=temp;
			}
		}
		
	}
	
	
	public static void main(String[] ags) {
		int[] arr={5,9,1,3,7,6,5,4};
		System.out.println("Array before sorting is:-");
		print(arr);
		System.out.println("Array after sorting is:-");
		sort(arr);
		print(arr);
	}
	
	public static void print(int[] a) {
		for (int i : a) {
			System.out.print(i +"  ");
		}
	}
	
}
