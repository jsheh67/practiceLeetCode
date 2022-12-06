package DecWeek1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//2351
public class FirstLetterToAppearTwice {
    public static char repeatedCharacter(String s) {
        //Set<Character> letters = new HashSet<>();
        List<Character> letters = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (!letters.contains(s.charAt(i))) {
                letters.add(s.charAt(i));
            } else {
                return s.charAt(i);
            }
        }
        return 'a';
    }

    public static void main(String[] args) {
        System.out.println(repeatedCharacter("abccbaacz"));
    }



}
