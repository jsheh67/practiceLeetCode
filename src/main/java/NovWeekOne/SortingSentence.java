package NovWeekOne;

import java.util.HashMap;

public class SortingSentence {

    public static String sortSentence(String s) {

        String[] array = s.split("\s");

        HashMap map = new HashMap<>();
        for(String str: array){
            map.put(Integer.parseInt(str.substring(str.length()-1)), str.substring(0,str.length()-1));
        }

        StringBuilder builder= new StringBuilder();

        for(int i=1; i<= array.length; i++){
            String a= (String) map.get(i);
            builder.append(a);
            builder.append(" ");
        }

        return builder.substring(0,builder.length()-1);

    }

    public static void main(String[] args) {
        System.out.println(sortSentence("is2 sentence4 This1 a3"));
    }


}
