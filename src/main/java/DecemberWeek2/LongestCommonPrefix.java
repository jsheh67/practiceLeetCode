package DecemberWeek2;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {

        String shortest = Arrays.stream(strs).
                sorted((a,b)->a.length()-b.length()).
                findFirst().get();

        for(int i=1; i<=shortest.length(); i++){
            String prefix = shortest.substring(0,i);
            for(String s: strs){
                if(!s.startsWith(prefix)){
                    if(i==1){
                        return "";
                    }
                    return shortest.substring(0,i-1);
                }
            }
        }
        return shortest;
//        boolean more=true;
//        int i=1;
//        while(more){
//            if(strs[0].length()==0){
//                return "";
//            }
//            String prefix=strs[0].substring(0,i);
//            for (String s: strs){
//                if(!s.startsWith(prefix)){
//                    return strs[0].substring(0,i-1);
//                }
//            }
//            i++;
//        }
//        return strs[0].substring(0,i);


    }

    public static void main(String[] args) {
        String[] test={"flower","flow","flight"};
        //System.out.println(longestCommonPrefix(test));
        System.out.println(longestCommonPrefix(new String[]{"a","b"}));
    }

}
