package DecWeek1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UniqueNumberOfOccurances {
    public static boolean uniqueOccurrences(int[] arr) {
        Arrays.sort(arr);
        List<Integer> occurances = new ArrayList<>();
        int count =1;
        for(int i=1; i<arr.length; i++){
            if(arr[i]==arr[i-1]){
                count++;
            }else{
                int check = count;
                if(occurances.contains(check)){
                    return false;
                }
                occurances.add(count);
                count=1;

            }
        }
        System.out.println(occurances);
        if(occurances.contains(count)){
            return false;
        }
        occurances.add(count);
        return true;
    }

    public static void main(String[] args) {
        int[] test ={1,2,2,1,1,3};
        int[] test2 ={-3,0,1,-3,1,1,1,-3,10,0};
        int [] test3 ={1,2};

        System.out.println(uniqueOccurrences(test));
        System.out.println(uniqueOccurrences(test2));
        System.out.println(uniqueOccurrences(test3));

    }
}
