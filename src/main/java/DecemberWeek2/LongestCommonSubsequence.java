package DecemberWeek2;

import java.util.ArrayList;

public class LongestCommonSubsequence {
    public static String[] longShort(String s1, String s2){
        if(s1.length()>s2.length()){
            return new String[] {s1,s2};
        }else{
            return new String[] {s2,s1};
        }
    }

    public static int longestCommonSubsequence(String text1, String text2) {
        String shorter = longShort(text1,text2)[1];
        String longer = longShort(text1,text2)[0];
        StringBuilder b = new StringBuilder();

        int startIndex=0;

        for(char c: shorter.toCharArray()){
            for(int i=startIndex; i<longer.length(); i++){
                if(c==longer.charAt(i)){
                    b.append(c);
                    startIndex=i+1;
                }
            }
        }
        System.out.println(b.toString());
        return b.toString().length();
    }

    public static int longestCommonSubsequence2(String text1, String text2){
        char[] text1Arr= text1.toCharArray();
        char[] text2Arr= text2.toCharArray();

        ArrayList<Character> shared =new ArrayList<>();
        for(int i=0; i<text1.length(); i++){
            if(text2.contains(text1.substring(i,i+1))){
                shared.add(text1.charAt(i));
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println( longestCommonSubsequence("bsbininm","jmjkbkjkv"));
        System.out.println(longestCommonSubsequence("oxcpqrsvwf","shmtulqrypy"));

    }

}
