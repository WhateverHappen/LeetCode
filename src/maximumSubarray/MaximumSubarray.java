package maximumSubarray;

/**
 * Created by thanatos on 2017/10/1.
 */
public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int curSum = 0;

        for (int i : nums) { // 当前和小于0，就将当前值赋给curSum
            if (curSum <= 0){
                curSum = i;
            } else { // 否则进行累加
                curSum += i;
            }

            // 保存较大的值
            if (max < curSum) {
                max = curSum;
            }
        }

        return max;
    }
}
