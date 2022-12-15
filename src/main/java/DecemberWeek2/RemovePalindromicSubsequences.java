package DecemberWeek2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Optional;

public class RemovePalindromicSubsequences {

    public static boolean isPalindrome(String s){
        int end = s.length()-1;
        for(int i=0; i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(end)){
                return false;
            }
            end--;
        }
        return true;
    }

    public static String largestPalindromeSub(String s) {
        ArrayList<String> palidromes = new ArrayList<>();
        int end =s.length()-1;
        for(int i=0; i<s.length(); i++){
            for(int j=i; j<s.length(); j++){
                if(i>j && isPalindrome(s.substring(i,j))){
                    palidromes.add(s.substring(i,j));
                }
            }
        }
        return Collections.max(palidromes, Comparator.comparing(String::length));
    }

    public static int removePalindrome(String s){
        String newString =s;

        int count=0;
        while (newString.length()>0){
            String palindromeSub=largestPalindromeSub(s);
            newString = s.replace(palindromeSub,"");
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(removePalindrome("ababa"));
        System.out.println(removePalindrome("abb"));
    }





}
