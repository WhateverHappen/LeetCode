# 88 - Merge Sorted Array
>easy

Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

## Note
You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2. The number of elements initialized in nums1 and nums2 are m and n respectively.

## Solution
因为nums1有足够的空间，因此可以从nums1的最高位往前填充

[code](./MergeSortedArray.java)