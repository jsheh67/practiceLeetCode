package DecWeek1;

import java.util.Arrays;

public class CountWordsWithPrefix {
    public int prefixCount(String[] words, String pref) {
        int count =0;
        for(String w: words){
            if(w.startsWith(pref)){
                count++;
            }
        }
        return count;
    }

    public int prefixCount2(String[] words, String pref) {
        return (int) Arrays.stream(words).filter(w->w.startsWith(pref)).count();
    }


}
