package DecWeek1;

import java.util.Arrays;

public class SumOfUniqueElements {

    public static int sumOfUnique(int[] nums) {
        Arrays.sort(nums);
        int sum =0;
        for(int i=0; i<nums.length; i++){
            if(( i-1>=0 && nums[i-1]==nums[i] )||(i+1<nums.length && nums[i+1]==nums[i] )){
                //i++;
                continue;
            }
            sum+=nums[i];
        }
        return sum;
    }

    public static void main(String[] args) {
//        System.out.println(sumOfUnique(new int[]{1,2,3,2}));
//        System.out.println(sumOfUnique(new int[]{1,1,1,1}));
//        System.out.println(sumOfUnique(new int[]{1,2,3,4,5}));
        System.out.println(sumOfUnique(new int[]{85,83,62,70,5,90,57,21,7,61,97,7,26,32,21,13,5,18}));
    }
}
