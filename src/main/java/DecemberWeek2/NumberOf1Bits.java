package DecemberWeek2;
//191
public class NumberOf1Bits {
    public int hammingWeight(int n) {
        int sum =0;
        String num = Integer.toBinaryString(n);
        for(int i=0; i<num.length(); i++){
            if(num.charAt(i)=='1'){
                sum++;
            }
        }
        return sum;

    }
}
