package DecemberWeek2;

import java.util.ArrayList;

public class OptimalPartitionOfString {

    public static int OptimalPartitionOfString(String S){
        int count =1;
        ArrayList<Character> substring = new ArrayList<>();
        for(int i=0; i<S.length(); i++){
            if(!substring.contains(S.charAt(i))){
                substring.add(S.charAt(i));
            }
            else{
                substring= new ArrayList<>();
                substring.add(S.charAt(i));
                count++;
            }
            //substring.add(S.charAt(i));
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(OptimalPartitionOfString("abacaba"));
        System.out.println(OptimalPartitionOfString("gizfdfri"));
    }
}
