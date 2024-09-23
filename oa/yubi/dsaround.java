// Online Java Compiler
// Use this editor to write, compile and run your Java code online

// You are given an array of integers nums, there is a sliding window of size k which is moving from the very left of the array to the very right. You can only see the k numbers in the window.


// Each time the sliding window moves right by one position.

// Return the max in the sliding window.
/*
// st = 0;
Input: nums = [1,3,-1,-3,5,3,6,7] n = 8, k = 3
// Time -> n + n (worst) = 2n = O(n)
// Space - O(n) 
10 2 3 4 5 10
Output: [3,3,5,5,6,7]
1,3,-1,
Max Priority of Size k
1, 3, -1, 

// remove of Priority(n) 
// Deque() -> 
// dq
// Decreasing Order -> 
nums = [4,3,2,-3,5,3,6,7]
//      0 1 2  3
*/
// O(n) operation

/* 
Given a string s. In one step you can insert any character at any index of the string.
Return the minimum number of steps to make s palindrome.

A Palindrome String is one that reads the same backward as well as forward.

Input: s = "zzazz"
Output: 0
Input: s = "mbadm"
Output: 2
Input: s = "leetcode"
Output: 5
mbadm
mdabm mam
leetcode -- 8
edocteel ece 
zzazz
zzazz

// Why LCS ? Because those chars are good. 

// mbdadm 
// m b d a d m
// 0 1 2 3 4 5
// variables that change are 2, so I am thinking choices^n
// i = 0;
// j = 5;
// if same, return solve(i+1, j-1);
// if not same, op1 = 1 + solve(i+1, j)
                op2 = 1 + solve(i, j-1);
// return min(op1, op2);
// Two pointers 
// int dp[][]
// 0 row and 0th col
// Tabulation -> We think of all of the cases; 
// -> Cover edge cases
*/

import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        // System.out.println("Try programiz.pro");
        // Deque<Integer> dq = new Deque<>();
        int arr1[] = {1};
        System.out.println(Arrays.toString(solve(arr1, 1)));
    }
    
    // public static int[] solve(int arr[], int k) {
    //     int n = arr.length;
    //     int ans[] = new int[n-k+1];
    //     Deque<Integer> dq = new LinkedList<>();
    //     for(int i=0;i<n;i++) {
    //         // removing old values from the Deque;
    //         while(!dq.isEmpty() && i - dq.peekFirst() >= k) {
    //             dq.pollFirst();
    //         }
    //         // make sure, our deque is decreasing in order;
    //         while(!dq.isEmpty() && dq.peekLast() < arr[i]) {
    //             dq.pollLast();
    //         }
    //         dq.addLast(i);
    //         if(i>=(k-1)) {
    //             ans[i-(k-1)] = arr[dq.peekFirst()]; // maxvalue 
    //         }
    //     }
    //     return ans;
    // }
}
