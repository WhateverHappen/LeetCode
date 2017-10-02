package mergeSortedArray;

/**
 * Created by thanatos on 2017/10/2.
 */
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = m + n - 1;
        int indexNumsM = m - 1;
        int indexNumsN = n - 1;

        while(indexNumsM>=0&&indexNumsN>=0) {
            if(nums1[indexNumsM]>=nums2[indexNumsN]){
                nums1[index--]=nums1[indexNumsM--];
            }else {
                nums1[index--]=nums2[indexNumsN--];
            }
        }
        if(indexNumsM==-1){
            while (indexNumsN>=0){
                nums1[index--]=nums2[indexNumsN--];
            }
        }
    }
}
