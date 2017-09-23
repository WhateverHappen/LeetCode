# 1 - Two Sum
>easy

Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

## Example

    Given nums = [2, 7, 11, 15], target = 9,
    
    Because nums[0] + nums[1] = 2 + 7 = 9,
    return [0, 1].
   
## Solution

利用hashmap，key存放数值，value存放出现的位置。从前到后进行遍历，将target值减去当前的值，看是否存在map中，

若存在map中则取出相应的标号，退出。

[code](./TwoSum.java)