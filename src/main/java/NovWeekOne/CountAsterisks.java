package NovWeekOne;

import java.util.Arrays;

public class CountAsterisks {

    public static int countAsterisks(String s) {
        String[] split = s.split("\\|");
        //System.out.println(Arrays.toString(split));
        int len = split.length;
        int count =0;
        for(int i=0; i<len; i+=2){
            String str= split[i];
            for(int j=0; j<str.length(); j++){
                if(str.charAt(j)=='*'){
                    count++;
                }
            }
        }
        System.out.println(count);
        return count;
    }

    public static void main(String[] args) {
        countAsterisks("l|*e*et|c**o|*de|");
    }


}
