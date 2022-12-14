package DecemberWeek2;

import java.util.Arrays;

//931
public class MinimumFallingPath {
    public static int[] getMinInPath(int[] row, int index){

        int start =index-1;
        int end = index+1;
        if(index==0){
            start=0;
        }
        if(index==row.length-1){
            end=row.length-1;
        }
        int min =row[start];
        int minIndex =start;

        for(int i=start; i<=end; i++){
            if(row[i]<min){
                min=row[i];
                minIndex=i;
            }
        }
        //first index is min value, second is index of that value;
        return new int[]{min,minIndex};

    }

    public static int minFallingPathSum(int[][] matrix) {
        int sum =0;

        int min =matrix[matrix.length-1][0];
        int minIndex =0;

        for(int i=0; i<matrix[0].length; i++){
            if(matrix[matrix.length-1][i]<min){
                min=matrix[matrix.length-1][i];
                minIndex=i;
            }
        }
        sum+=min;


        for(int i= matrix.length-1; i>=0; i--){
            int[] res=getMinInPath(matrix[i],minIndex);
            sum+=res[0];
            minIndex=res[1];
        }
        return sum;


    }

    public static void main(String[] args) {
        int[][] test ={{2,1,3},{6,5,4},{7,8,9}};
        int[][] test2={{100,-42,-46,-41},{31,97,10,-10},{-58,-51,82,89},{51,81,69,-51}};
        System.out.println(minFallingPathSum(test2));
    }


}
