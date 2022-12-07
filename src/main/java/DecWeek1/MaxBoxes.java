package DecWeek1;

import java.util.Arrays;

public class MaxBoxes {

    public static int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes,(a,b)->Integer.compare(b[1],a[1]));
        int sum =0;
        int numBoxes=0;
        for(int i=0; i<boxTypes.length; i++){
            numBoxes+=boxTypes[i][0];
            sum+=boxTypes[i][0]*boxTypes[i][1];
            if (numBoxes>truckSize){
                int overload=numBoxes-truckSize;
                sum = sum-(overload*boxTypes[i][1]);
                break;
            }
        }
        return sum;

    }

    public static void main(String[] args) {
        int[][] boxes ={{1,3},{2,2},{3,1}};
        System.out.println(maximumUnits(boxes,4));

    }
}
