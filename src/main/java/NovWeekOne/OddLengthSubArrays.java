package NovWeekOne;

import java.util.Arrays;

public class OddLengthSubArrays {
    public static int sumOddLengthSubarrays(int[] arr) {
//        int length = arr.length;
//        int sum = 0;
//        for (int i = 0; i < length; i++) {
//            sum += arr[i];
//        }
//        if (length >= 3 && length % 2 != 0) {
//            sum = sum * 2;
//        }
//        return sum;
        int[] multipliers = new int[arr.length];
        int length = arr.length;

        int j= arr.length-1;

        int numDivisions = ((length/2)+(length%2));
        int adjust= numDivisions;



        for(int i=0; i<(arr.length/2); i++){
           arr[i]=numDivisions;
           arr[j]=numDivisions;
           j--;
           if(length%2==0){
               adjust=adjust-1;
               numDivisions+=adjust;
           }else{
               if(i==0){
                   adjust=adjust-2;
                   numDivisions += adjust;
               }else {
                   adjust = adjust - 1;
                   numDivisions += adjust;
               }
           }
        }

        System.out.println(Arrays.toString(arr));

        return 1;



    }

    public static void main(String[] args) {
        int[] test6={1,2,3,4,5,8};
        int[] test5={1,4,2,5,3};
        int[] test4={1,2,3,4};
        int[] test3={1,2,3};
        int[] test7={1,2,3,4,5,6,7};
        int[] test8={1,2,3,4,5,6,7,8};
        int[] test9={1,2,3,4,5,6,7,8,9};

        sumOddLengthSubarrays(test3);
        sumOddLengthSubarrays(test4);
        sumOddLengthSubarrays(test5);
        sumOddLengthSubarrays(test6);
        sumOddLengthSubarrays(test7);
        sumOddLengthSubarrays(test8);
        sumOddLengthSubarrays(test9);


        //System.out.println(sumOddLengthSubarrays(test));

//        System.out.println(7/2 + (7%2));
//        System.out.println(6/2 + (6%2) );
//        System.out.println(5/2 + (5%2));
//        System.out.println(4/2 +(4%2));
//        System.out.println(3/2 +(3%3));
//        System.out.println(2/2 +(2%2));
    }
}
