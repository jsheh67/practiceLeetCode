package DecWeek1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

//682
public class BaseballGame {
    public static int calPoints(String[] operations) {
        List<Integer> results = new ArrayList<>();

        for (int i = 0; i < operations.length; i++) {
            int size = results.size();
            if (operations[i] == "+") {
                int toAdd = results.get(size - 1) + results.get(size - 2);
                results.add(toAdd);
            } else if (operations[i] == "D") {
                int doubled = results.get(size - 1) * 2;
                results.add(doubled);
            } else if (operations[i] == "C") {
                results.remove(size - 1);
            } else {
                results.add(Integer.parseInt(operations[i]));

            }
        }
        return results.stream().mapToInt(Integer::intValue).sum();
    }




    public static void main(String[] args) {
        String[] test ={"5","2","C","D","+"};
        System.out.println(calPoints(test));
    }


}
