Algorithm / Intuition
Solution1: Sorting
Intuition:
We can sort the array in ascending order, hence the largest element will be at the last index of the array. 

Approach: 
Sort the array in ascending order.
Print the (size of the array -1)th index.
DryRun: 
Before sorting: arr[] = {2,5,1,3,0};

After sorting: arr[] = {0,1,2,3,5};

Hence answer : arr[sizeofthearray-1] =5

Code

from typing import List
def sortArr(arr: List[int]) -> int:
    arr.sort()
    return arr[-1]
if __name__ == "__main__":
    arr1 = [2, 5, 1, 3, 0]
    arr2 = [8, 10, 5, 7, 9]
    print("The Largest element in the array is:", sortArr(arr1))
    print("The Largest element in the array is:", sortArr(arr2))

