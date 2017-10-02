# 118 - Pascal's Triangle
>easy

Given numRows, generate the first numRows of Pascal's triangle.

## Example
For example, given numRows = 5,
Return

    [
         [1],
        [1,1],
       [1,2,1],
      [1,3,3,1],
     [1,4,6,4,1]
    ]
## Solution
如果输入的数字是0，直接返回一个空的List；如果输入的数字大于0，首先在
整个List中压入第一个List[1]，之后再进行循环。由于之前已经存入第一行的数字，
因此在循环时，从第二行开始考虑。从第二行开始，首先压入一个1，第二个数字是
上一行两个数字之和。

[code](./PascalTriangle.java)