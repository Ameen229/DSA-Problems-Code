Algorithm / Intuition
Solution 1: (Brute Force) [this approach only works if there are no duplicates]
Intuition:
What do we do to find the largest or the smallest element present in an array? We ideally sort them and the first element would be the smallest of all while the last element would be the largest. Can we find the second-smallest and second-largest using a similar approach?

Approach:
Sort the array in ascending order
The element present at the second index is the second smallest element
The element present at the second index from the end is the second largest element

Complexity Analysis
Time Complexity: O(NlogN), For sorting the array

Space Complexity: O(1)
Code

import java.io.*;
import java.util.Arrays;
class 2_Find Second Smallest and Second Largest Element in an array_Java_code
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
	Arrays.sort(arr);
	int small = arr[1];
	int large = arr[n - 2];
	System.out.println("Second smallest is "+small);
	System.out.println("Second largest is "+large);
}
public static void main(String[] args)
{
	int[] arr = {1, 2, 4, 6, 7, 5};
	int n = arr.length;
	getElements(arr, n);
}
}

