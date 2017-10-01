# 53 - Maximum Subarray
>easy

Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

## Example
given the array 
 
    [-2,1,-3,4,-1,2,1,-5,4]
the contiguous subarray
 
    [4,-1,2,1]
has the largest sum = 6.

## Solution
动态规划问题，已知了前k个元素的最大子序列和为maxSub（已经被记录下来了），以及一个临时和sum，如果添加了第k+1这个元素，由于是连续子序列这个限制，所以如果k+1这个元素之前的和是小于0的，那么对于增大k+1这个元素从而去组成最大子序列是没有贡献的，所以可以把sum 置0。 

[code](./MaximumSubarray.java)