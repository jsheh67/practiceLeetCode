package DecWeek1;

import java.util.Arrays;
import java.util.Collections;

import static java.util.Collections.*;

public class ReverseIntegers {

    public static int countDistinctIntegers(int[] nums) {
        int[] reversed = new int[nums.length];
        for (int i=0; i<nums.length; i++){
            String num = Integer.toString(nums[i]);
            if(num.length()<=1){
                reversed[i]=nums[i];
            }else {
                char[] numAr = num.toCharArray();
                StringBuilder b = new StringBuilder();
                for(int j=numAr.length-1; j>=0; j--){
                    b.append(numAr[j]);
                }

                reversed[i] = Integer.parseInt(b.toString());
            }
        }
        int[] all = new int[2*nums.length];
        for(int i=0; i<nums.length;i++){
            all[i]=nums[i];
            all[i+nums.length]=reversed[i];
        }
        return (int) Arrays.stream(all).distinct().count();

    }

    public static void main(String[] args) {
        System.out.println(countDistinctIntegers(new int[]{1,13,10,12,31}));
        System.out.println(countDistinctIntegers(new int[]{2,2,2}));

    }


}
