package DecemberWeek2;

import java.util.HashMap;

public class RomanToInteger {
    public static int romanToInt(String s) {
        HashMap<Character,Integer> numerals = new HashMap<>();
        numerals.put('I',1);
        numerals.put('V',5);
        numerals.put('X',10);
        numerals.put('L',50);
        numerals.put('C',100);
        numerals.put('D',500);
        numerals.put('M',1000);

        int sum =0;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            int mult=1;
            if(c=='I' && (s.charAt(i+1)=='V'||s.charAt(i+1)=='X')){
                mult=-1;
            }
            if(c=='X' && (s.charAt(i+1)=='L'||s.charAt(i+1)=='C')){
                mult=-1;
            }
            if(c=='C' && (s.charAt(i+1)=='D'||s.charAt(i+1)=='M')){
                mult=-1;
            }

            sum+=(numerals.get(s.charAt(i))*mult);
        }

        return sum ;


    }

    public static void main(String[] args) {
        System.out.println(romanToInt("\"MCMXCIV"));
    }


}
