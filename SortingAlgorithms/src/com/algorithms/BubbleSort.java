package com.algorithms;

public class BubbleSort extends Sort {
	
	public static void sort(int[] a) {
		
		int n=a.length;
		//select first element
		for(int i=n-1;i>=0;i--) {
			//compare it with adjacent
			for(int j=0;j<i;j++) {
		
				//if greater Swap
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
				}
			}
			
		}
		 
		
	}
	public static void main(String[] args) {
		int[] a= {7,2,8,4,6,21,8,4,96,72};
		print(a);
		sort(a);
		System.out.println("After Sortiing-");
		print(a);
		
	}

}
