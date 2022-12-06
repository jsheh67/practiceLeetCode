package DecWeek1;

import java.util.HashMap;

//1309
public class DecryptStringFromAlphabetToInteger {
    public static String freqAlphabets(String s) {
        HashMap map = new HashMap<>();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 1; i <= 26; i++) {
            String key = String.valueOf(i);
            if (i > 9) {
                key = key + "#";
            }
            map.put(key, alphabet.charAt(i - 1));
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i+3<=s.length() && s.substring(i, i + 3).contains("#")) {
                builder.append(map.get(s.substring(i, i + 3)));
                i += 2;
            } else {
                builder.append(map.get(s.substring(i, i + 1)));
            }
        }
        return builder.toString();
    }




    public static void main(String[] args) {
        System.out.println(freqAlphabets("10#11#12"));



    }
}
