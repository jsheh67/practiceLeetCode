package NovWeekOne;

import java.util.Arrays;

public class RemoveOuterParenthesis {
    public static String removeOuterParentheses(String s) {
        char[] string = s.toCharArray();
        for(int i=0; i<string.length; i++){
            if(string[i]=='('&& string[i+1]!=')'){
                string[i]='~';
            }
            if(string[i]==')'&& string[i-1]!='('){
                string[i]='~';
            }
        }
        return String.valueOf(string).replace("~","");
    }

    public static void main(String[] args) {
        System.out.println( removeOuterParentheses("(()())(())"));

    }
}
