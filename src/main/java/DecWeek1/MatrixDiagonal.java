package DecWeek1;
//1572
public class MatrixDiagonal {
    public static int diagonalSum(int[][] mat) {
        int size = mat.length;
        boolean odd = !(size%2==0);
        int sum=0;

        for(int i=0; i<size; i++){
            sum += mat[i][i];
        }

        int b=size;
        for(int i=0; i<size; i++){
            if(i==b-1){
                b--;
                continue;
            }
            int second= mat[i][b-1];
            sum+= second;
            b--;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] test = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(diagonalSum(test));

    }

}
