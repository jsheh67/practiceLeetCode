package DecWeek1;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumber {

    public List<Integer> selfDividingNumbers2(int left, int right) {

        List<Integer> results = new ArrayList<>();
        for(int i=left; i<=right; i++) {
            String num = String.valueOf(i);

            int count = 0;
            if(!num.contains("0")){
                for (char c : num.toCharArray()) {

                    int i1 = i % Integer.parseInt(String.valueOf(c));


                    if (i1 != 0) {
                        break;
                    }
                    if (i1 == 0) {
                        count++;
                    }
                    if (count == num.length()) {
                        results.add(i);
                    }
                }
            }
        }
        return results;
    }
}
