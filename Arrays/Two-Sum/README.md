# Problem Name
TWO SUM
LeetCode: 0001
Difficulty: Easy
Topic: Array

## Problem
You are given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

## Example
Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:
Input: nums = [3,3], target = 6
Output: [0,1]
 
## Approach
I used a brute-force approach to solve this problem.

## Step-by-Step Logic
1.Store the length of the array in n.
2.Start the first loop with index i = 0.
3.Start the second loop from j = i + 1 so that:
4.Calculate nums[i] + nums[j].
5.If the sum is equal to target, return the indices [i, j].
6.Continue checking other pairs if the current pair does not match.
7.If no pair is found, return an empty array.

## Complexity
Space Complexity-O(1)
Time Complexity-O(n²)
