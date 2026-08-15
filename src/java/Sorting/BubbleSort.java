package Sorting;

import util.Util;

public class BubbleSort
{
	public static void main(String[] args)
	{

		int[] arr = {64, 34, 25, 12, 22, 11, 90};
		bubbleSort(arr);
		System.out.println("Sorted array: ");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}

	private static void bubbleSort(int[] arr)
	{
		for(int i = 0; i < arr.length - 1; i++)
		{
			for(int j = i + 1; j < arr.length; j++)
			{
				if(arr[i] > arr[j])
				{
					Util.swap(arr, i, j);
				}
			}
		}
	}
}
