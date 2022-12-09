package DecWeek1;
//338
public class CountBits {
    public int[] countBits(int n) {
        int[] r = new int[n+1];
        for(int i=0; i<=n; i++){
            r[i]=Integer.bitCount(i);
        }
        return r;
    }
}
