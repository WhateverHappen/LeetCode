package removeDuplicatesFromSortedArray;

/**
 * Created by thanatos on 2017/9/23.
 */
public class Remove {
    public int removeDuplicates(int[] nums) {
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[j]!=nums[i]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }
}
