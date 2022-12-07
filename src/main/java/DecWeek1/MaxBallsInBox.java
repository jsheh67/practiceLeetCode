package DecWeek1;

import java.util.HashMap;

//1742
public class MaxBallsInBox {
    public static int countBalls(int lowLimit, int highLimit) {
        HashMap<Integer, Integer> boxes = new HashMap<>();

        for(int i=lowLimit; i<=highLimit; i++){
            String s = String.valueOf(i);
            int boxNum =0;
            for(int j=0; j<s.length(); j++){
                boxNum+=s.charAt(j)-48;
            }
            if(null==boxes.get(boxNum)){
                boxes.put(boxNum,1);
            }else{
                boxes.put(boxNum,boxes.get(boxNum)+1);
            }

        }

        return boxes.values().stream().max((a,b)-> a-b).orElse(1);


        //return 1;
    }

    public static void main(String[] args) {
        System.out.println( countBalls(1,20));
    }


}
