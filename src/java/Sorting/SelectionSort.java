package Sorting;

import util.Util;

public class SelectionSort
{
	public static void main(String[] args){

		int[] arr = {64, 25, 12, 22, 11};
		selectionSort(arr);
		System.out.println("Sorted array: ");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}

	public static void selectionSort(int[] arr) {
		int min = 0;
		for(int i=0;i<arr.length-1;i++){

			for(int j=i+1;j<arr.length;j++){
				if(arr[j]<arr[min]){
					min = j;
				}
			}
			Util.swap(arr, i, min);
		}
	}
}
