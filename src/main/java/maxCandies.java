import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class maxCandies {

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> kids = new ArrayList<>();
        for(int i=0; i<candies.length; i++){
            int max = Arrays.stream(candies).max().getAsInt();
            if(candies[i]+extraCandies>=max){
                kids.add(true);
            }else{
                kids.add(false);
            }
        }
        return kids;
    }

    public static void main(String[] args) {
        int[] test={2,3,5,1,3};
        System.out.println(kidsWithCandies(test, 3));
    }
}
