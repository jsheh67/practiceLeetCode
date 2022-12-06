package DecWeek1;

import java.util.Arrays;

public class DivideArrayToEqualPairs {
    public boolean divideArray(int[] nums) {
        Arrays.sort(nums);
        for(int i=1; i<nums.length; i+=2){
            if(nums[i-1]!=nums[i]){
                return false;
            }
        }
        return true;
    }

}
