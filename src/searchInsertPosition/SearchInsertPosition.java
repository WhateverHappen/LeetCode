package searchInsertPosition;

/**
 * Created by thanatos on 2017/10/1.
 */
public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int result = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                result = i;
                break;
            }else if(target>nums[i]){
                continue;
            }else if(target<nums[i]){
                result=i;
                break;
            }
        }
        if(result==-1){
            result=nums.length;
        }
        return result;
    }
}
