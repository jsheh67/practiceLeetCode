package NovWeekOne;

public class NumberOfArithmeticTriplets {

    //could improve with binary search
    public static boolean arrayHasNums(int[] array, int target){
        for(int i: array){
            if(i==target){
                return true;
            }
        }
        return false;
    }

    public int arithmeticTriplets(int[] nums, int diff) {
        int count =0;
        for(int i=0; i<nums.length ;i++){
            if(arrayHasNums(nums, nums[i]+diff)  && arrayHasNums(nums, nums[i]+2*diff)){
                count++;
            }
        }
        return count;
    }


}
