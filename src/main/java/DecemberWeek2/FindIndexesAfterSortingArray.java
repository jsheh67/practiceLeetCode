package DecemberWeek2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//2089
public class FindIndexesAfterSortingArray {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> results = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            if(nums[i]==target){
                results.add(i);
            }
        }
        return results;

    }

    public List<Integer> targetIndices2(int[] nums, int target) {
        List<Integer> results = new ArrayList<>();
        int count=0;
        int lessThanTarget=0;

        for(int i=0; i<nums.length; i++){
            if(nums[i]<target){
                lessThanTarget++;
            }
            if(nums[i]==target){
                count++;
            }
        }

        for(int i=lessThanTarget; i<lessThanTarget+count; i++){
            results.add(i);
        }
        return results;

    }

}
