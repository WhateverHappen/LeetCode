# 27 - Remove Element
>easy

Given an array and a value, remove all instances of that value in place and return the new length.

Do not allocate extra space for another array, you must do this in place with constant memory.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.

## Example
Given input array nums = [3,2,2,3], val = 3

Your function should return length = 2, with the first two elements of nums being 2.

## Hints
### Hint 1
Try two pointers.
### Hint 2
Did you use the property of "the order of elements can be changed"?
### Hint 3
What happens when the elements to remove are rare?

## Solution
### Intuition
Since question asked us to remove all elements of the given value in-place, we have to handle it with O(1)extra space. How to solve it? We can keep two pointers i and j, where i is the slow-runner while j is the fast-runner.
### Algorithm
When nums[j] equals to the given value, skip this element by incrementing j. As long as nums[j] ≠val, we copy nums[j] to nums[i] and increment both indexes at the same time. Repeat the process until j reaches the end of the array and the new length is i.

This solution is very similar to the solution to Remove Duplicates from Sorted Array.

[code](./Solution.java)