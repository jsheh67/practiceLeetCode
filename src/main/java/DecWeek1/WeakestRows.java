package DecWeek1;

import java.util.Arrays;

//1337
public class WeakestRows {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[][] results = new int[mat.length][2];
        for(int i=0; i<mat.length; i++){

            int rowSum=0;
            for(int j=0; j<mat[0].length; j++){
                rowSum+=mat[i][j];
            }
            results[i][0]=i;
            results[i][1]=rowSum;
        }
        Arrays.sort(results, (a,b)->Integer.compare(a[1],b[1]));

        int[] toret = new int[k];
        for(int i=0; i<k; i++){
            toret[i]=results[i][1];
        }
        return toret;

    }
}
