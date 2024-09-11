Algorithm / Intuition
Approach: Brute Force
The idea is pretty simple here, We will start with the element at the 0th index, and will compare it with all of its future elements that are present in the array.
If the picked element is smaller than or equal to all of its future values then we will move to the next Index/element until the whole array is traversed.
If any of the picked elements is greater than its future elements, Then simply we will return False.
If the size of the array is Zero or One i.e ( N = 0 or N = 1 ) or the entire array is traversed successfully then we will simply return True.
Complexity Analysis
Time Complexity: O(N^2)

Space Complexity: O(1)
Code

def isSorted(arr, n):
    for i in range(n):
        for j in range(i + 1, n):
            if arr[j] < arr[i]:
                return False

    return True

if __name__ == "__main__":
    arr = [1, 2, 3, 4, 5]
    n = len(arr)
    ans = isSorted(arr, n)
    if ans:
        print("True")
    else:
        print("False")

