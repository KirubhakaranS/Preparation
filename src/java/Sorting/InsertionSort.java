package Sorting;

public class InsertionSort
{
	public static void main(String[] args)
	{

		int[] arr = {12, 11, 13, 5, 6};
		insertionSort(arr);
		System.out.println("Sorted array: ");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}

	public static void insertionSort(int[] arr)
	{

		for(int i = 0; i < arr.length; i++)
		{
			int j = i - 1;
			int key = arr[i];
			while(j >= 0 && arr[j] > key)
			{
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}

	}
}
