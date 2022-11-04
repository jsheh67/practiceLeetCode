package NovWeekOne;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class SortThePeople {

    public static String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer, String> heightMap= new HashMap<>();
        for(int i=0; i<names.length; i++){
            heightMap.put(heights[i], names[i]);
        }

        Arrays.sort(heights);

        String[] result = new String[names.length];
        for(int i=0; i<names.length; i++){
            result[i]=heightMap.get(heights[i]);

        }
        Collections.reverse(Arrays.asList(result));
        return result ;


    }

    public static void main(String[] args) {
        String[] names={"Mary","John","Emma"};
        int[] heights={180,165,170};

        System.out.println(Arrays.deepToString(sortPeople(names, heights)));
    }


}
