Algorithm / Intuition
Solution 2:
Approach: 
Here, in the given array :

n = 5,
arr[] = {1,2,3,4,5}
At first, we have to shift the array towards the left so, we store the value of the first index in a variable (let it be x).

Then we iterate the array from the 0th index to the n-1th index(why n-1 i will explain it below)

And then store the value present in the next index to the current index like this :

arr[i] = arr[i+1]
And to prevent its segmentation fault we will iterate it till n-1.

At last, put the value of variable x in the last index of the array.
Complexity Analysis
Time Complexity: O(n), as we iterate through the array only once.

Space Complexity: O(1) as no extra space is used
code

def solve(arr, n):
    temp = arr[0]  # storing the first element of the array in a variable
    for i in range(n - 1):
        arr[i] = arr[i + 1]
    arr[n - 1] = temp  # assign the value of the variable at the last index
    for i in range(n):
        print(arr[i], end=" ")

n = 5
arr = [1, 2, 3, 4, 5]
solve(arr, n)

