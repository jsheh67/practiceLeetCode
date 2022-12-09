package DecWeek1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//2032
public class TwoOfThree {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> results = new ArrayList<>();
        for(int num: nums1){
            //Stream.concat(Arrays.stream(nums2), Arrays.stream(nums3)).anyMatch()
            if(Arrays.stream(nums2).anyMatch(a->a==num)||Arrays.stream(nums3).anyMatch(a->a==num)){
                if(!results.contains(num)){
                    results.add(num);
                }
            }
        }

        for(int num: nums2){
            //Stream.concat(Arrays.stream(nums2), Arrays.stream(nums3)).anyMatch()
            if(Arrays.stream(nums3).anyMatch(a->a==num)){
                if(!results.contains(num)){
                    results.add(num);
                }
            }
        }

        return results;

    }

}
