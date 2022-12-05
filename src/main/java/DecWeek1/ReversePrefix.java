package DecWeek1;

import java.util.Arrays;

public class ReversePrefix {
    public static String reversePrefix(String word, char ch) {
        char[] wordArr = word.toCharArray();
        int charIndex =0;
        for(int i=0; i< wordArr.length; i++){
            if(wordArr[i]==ch){
                charIndex=i;
                break;
            }
        }
        for(int i=0; i<=charIndex; i++){
            if(i>charIndex){
                break;
            }
            char temp =wordArr[i];
            wordArr[i]=wordArr[charIndex];
            wordArr[charIndex]=temp;
            charIndex--;
        }
        return new String(wordArr);
    }

    public static void main(String[] args) {
        System.out.println(reversePrefix("abcdefd",'d'));
        System.out.println(reversePrefix("arzquwnjyn",'j'));

        System.out.println("jnwuqzrayn");
    }


}
