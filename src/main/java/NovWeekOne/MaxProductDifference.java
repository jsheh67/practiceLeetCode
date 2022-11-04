package NovWeekOne;

import java.util.Arrays;

public class MaxProductDifference {
    public static int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int l= nums.length;
        return ((nums[l-1]*nums[l-2])-(nums[0]*nums[1]));
    }

    public static void main(String[] args) {
        int[] test = {6,6,2,7,4};
        System.out.println(maxProductDifference(test));
    }

}
