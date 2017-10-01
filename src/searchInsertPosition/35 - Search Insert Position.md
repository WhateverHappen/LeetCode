# 35 - Search Insert Position
>easy

Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You may assume no duplicates in the array.

Here are few examples.

## Example
    [1,3,5,6], 5 → 2
    [1,3,5,6], 2 → 1
    [1,3,5,6], 7 → 4
    [1,3,5,6], 0 → 0
    
## Solution
1、如果target和nums[i]相等，返回i

2、如果target大于nums[i]，继续向后循环，寻找该插入的位置

3、如果target小于nums[i]，则将target放在i的位置

4、最后一定要进行判断result是否为-1，若为-1，证明target大于整个nums中的数，则将target放在最后一个位置

[code](./SearchInsertPosition.java)