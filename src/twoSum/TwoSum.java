package twoSum;

import java.util.HashMap;

/**
 * Created by thanatos on 2017/9/23.
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int result[] = new int[2];
        for (int i = 0; i < nums.length; i++){
            int num = target - nums[i];
            if(map.containsKey(num)){
                result[0] = map.get(num);
                result[1] = i;
                return result;
            }
            map.put(nums[i], i);
        }
        return result;
    }
}
