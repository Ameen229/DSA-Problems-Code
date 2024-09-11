Algorithm / Intuition
Solution 1: Brute force Approach
Intuition:
The rotated array has just a difference that its first element is present at the last index of the array. So if we can just store the element at the first index and then shift all the elements towards the left and at last put the stored element at the last index. We will get th rotated array.

Approach:
We can take another dummy array of the same length and then shift all elements in the array toward the left and then at the last element store the index of 0th index of the array and print it.
Time Complexity: O(n), as we iterate through the array only once.

Space Complexity: O(n) as we are using another array of size, same as the given array.
code

#include<bits/stdc++.h>

using namespace std;
void solve(int arr[], int n) {
  int temp[n];
  for (int i = 1; i < n; i++) {
    temp[i - 1] = arr[i];
  }
  temp[n - 1] = arr[0];
  for (int i = 0; i < n; i++) {
    cout << temp[i] << " ";
  }
  cout << endl;
}
int main() {
  int n=5;
  
  int arr[]= {1,2,3,4,5};
  solve(arr, n);
}

