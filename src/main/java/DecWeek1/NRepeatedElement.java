package DecWeek1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NRepeatedElement {
    public int repeatedNTimes(int[] nums) {
        Arrays.sort(nums);
        int length = nums.length;
        int count = 1;
        for (int i = 0; i < length; i++) {
            if (nums[i] == nums[i + 1]) {
                count++;
            } else {
                count = 1;
            }
            if (count == length / 2) {
                return nums[i];
            }
        }
        return 0;
    }

}
