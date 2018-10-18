package com.ds.array;

public class RotateArray {

	private static int[] rotate(int[] arr, int k){
		if(arr.length < 2){
			return arr;
		}
		if(k > arr.length){
			k = k % arr.length;
		}
		reverseArray(arr, 0, k-1);
		reverseArray(arr, k, arr.length-1);
		reverseArray(arr, 0, arr.length-1);
		return arr;
	}
	
	private static void reverseArray(int[] arr, int start, int end){
		while(start < end){
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;		
			start++;
			end--;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,7,6,3,2};
		int arrResult[] = rotate(arr, 2);
		for (int i : arrResult) {
			System.out.print(i+ " ");
		}
		
	}

}
