package search;

public class BinarySearch
{
	public static void main(String[] args)
	{
		int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
		int target = 13;
		int index = binarySearch(arr, target);
		if(index != -1)
		{
			System.out.println("Element found at index: " + index);
		}
		else
		{
			System.out.println("Element not found in the array.");
		}
	}

	public static int binarySearch(int[] arr, int target)
	{
		int left = 0;
		int right = arr.length - 1;

		int mid = (left + right)/2;

		while(left <= right)
		{
			System.out.println("Left: " + left + ", Right: " + right + ", Mid: " + mid);

		 if(arr[mid]==target){
			 return mid;
		 } else if(arr[mid]<target){
			 left = mid;
		 } else {
			 right =mid;
		 }
		  mid = (left + right)/2;
		}
		return -1;
	}
}
