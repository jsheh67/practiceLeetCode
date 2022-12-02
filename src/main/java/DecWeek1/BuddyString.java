package DecWeek1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//859
public class BuddyString {
    public static boolean buddyStrings(String s, String goal) {
        int diff=0;
        Set<Character> sSet = new HashSet<>();
        Set<Character> goalSet = new HashSet<>();

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)!=goal.charAt(i)){
                diff++;
            }
            sSet.add(s.charAt(i));
            goalSet.add(goal.charAt(i));
//            if(i+1<s.length() && s.charAt(i)==s.charAt(i+1) && s.equals(goal)){
//                twoInARow=true;
//            }
        }
        boolean sameletters=false;
        char[] sArray = s.toCharArray();
        Arrays.sort(sArray);
        char[] goalArray = goal.toCharArray();
        Arrays.sort(goalArray);
        if(Arrays.equals(goalArray,sArray)){
            sameletters=true;
        }

        return (((diff==2)&&sameletters)||(sameletters&& sSet.size()<sArray.length) && diff==0);

    }
//    public static boolean buddyStrings2(String s, String goal) {
//
//
//    }
    public static void main(String[] args) {
        System.out.println( buddyStrings("abcaa","abcbb"));
        System.out.println(buddyStrings("abab","abab"));
        System.out.println(buddyStrings("baba","abab"));
    }
}
