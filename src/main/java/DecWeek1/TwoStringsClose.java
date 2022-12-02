package DecWeek1;
//1657

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TwoStringsClose {

    public static boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length()){
            return false;
        }
        //Boolean sameLetters;
        Set<Character> word1set = new HashSet<>();
        Set<Character> word2set = new HashSet<>();


        for(int i=0; i<word1.length(); i++){
            word1set.add(word1.charAt(i));
            word2set.add(word2.charAt(i));
        }
        for(Character c: word1set){
            if (!word2set.contains(c)){
                return false;
            }
        }


        int[] w1lettercounts=new int[word1set.size()];
        int[] w2lettercounts =new int[word2set.size()];
        int j=0;

        for(char c: word1set){
            int w1count=0;
            int w2count=0;
            for(int i=0; i<word1.length(); i++){
                if(word1.charAt(i)==c){
                    w1count++;
                }
                if(word2.charAt(i)==c){
                    w2count++;
                }
            }
            w1lettercounts[j]=w1count;
            w2lettercounts[j]=w2count;
            j++;
        }
        Arrays.sort(w1lettercounts);
        Arrays.sort(w2lettercounts);

        for(int i=0; i<w1lettercounts.length; i++){
            if(w1lettercounts[i]!=w2lettercounts[i]){
                return false;
            }
        }


        return true;

    }

    public static void main(String[] args) {
        String word1="abc";
        String word2="bca";
        System.out.println(closeStrings(word1,word2));
        System.out.println(closeStrings("a","aa"));

    }
}
