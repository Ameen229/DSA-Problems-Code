Solution 2(Better Solution)
Intuition:
Even though we want to have just the second smallest and largest elements, we are still sorting the entire array for that and thus increasing the time complexity. Can we somehow try to not sort the array and still get our answer?

Approach:
Find the smallest and largest element in the array in a single traversal
After this, we once again traverse the array and find an element that is just greater than the smallest element we just found.
Similarly, we would find the largest element which is just smaller than the largest element we just found
Indeed, this is our second smallest and second largest element.
Complexity Analysis
Time Complexity: O(N), We do two linear traversals in our array

Space Complexity: O(1)
Code

import java.io.*;
import java.util.Arrays;
class 2_Find Second Smallest and Second Largest Element in an array_Java_Code
{
static private void getElements(int[] arr, int n)
{
if (n == 0 || n==1)
	{
		System.out.print(-1);
		System.out.print(" ");
		System.out.print(-1);
		System.out.print("\n");
	}
	int small = Integer.MAX_VALUE;
	int second_small = Integer.MAX_VALUE;
	int large = Integer.MIN_VALUE;
	int second_large = Integer.MIN_VALUE;
	int i;
	for (i = 0;i < n;i++)
	{
		small = Math.min(small,arr[i]);
		large = Math.max(large,arr[i]);
	}
	for (i = 0;i < n;i++)
	{
		if (arr[i] < second_small && arr[i] != small)
		{
			second_small = arr[i];
		}
		if (arr[i] > second_large && arr[i] != large)
		{
			second_large = arr[i];
		}
	}

	System.out.println("Second smallest is "+second_small);
	System.out.println("Second largest is "+second_large);
}
public static void main(String[] args)
{
	int[] arr = {1, 2, 4, 6, 7, 5};
	int n = arr.length;
	getElements(arr, n);
}
}


