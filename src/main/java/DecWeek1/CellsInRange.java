package DecWeek1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CellsInRange {
    public static List<String> cellsInRange(String s) {
       // int startCol = ;
//        int endCol = s.charAt(3);
//
//        int startRow = s.charAt(1);
//        int endRow = s.charAt(4);

        List<String> results = new ArrayList<>();

        for(int i=s.charAt(0); i<=s.charAt(3); i++) {
            for (int j = s.charAt(1); j <=s.charAt(4); j++) {
                String str = String.valueOf((char) i) + String.valueOf((char) j);
                results.add(str);
            }
        }
        return results;
        }




        public static void main(String[] args) {
            System.out.println(cellsInRange("K1:L2").toString());

    }
}
