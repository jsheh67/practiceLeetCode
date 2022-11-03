import java.util.Arrays;

public class LargestLocalValuesInMatrix {
    public static int[][] largestLocal(int[][] grid) {

        int length = grid.length;

        int[][] maxLocal = new int[length-2][length-2];

        for(int i=1; i<=length-2; i++){
            for(int j=1; j<=length-2; j++){

                int[] threeByThreeVals= {grid[i-1][j-1], grid[i][j-1], grid[i+1][j-1],
                        grid[i-1][j], grid[i][j], grid[i+1][j],
                        grid[i-1][j+1], grid[i][j+1], grid[i+1][j+1]};

                Arrays.sort(threeByThreeVals);

                maxLocal[i-1][j-1]=threeByThreeVals[8];

            }
        }

        return maxLocal;

    }

    public static void main(String[] args) {
        int[][] grid={{9,9,8,1},{5,6,2,6},{8,2,6,4},{6,2,2,2}};

        System.out.println(largestLocal(grid));
    }
}
