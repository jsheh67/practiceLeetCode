import java.util.Arrays;

public class MinSumFourDigitSplit {

    public static int minimumSum(int num) {
        String number = String.valueOf(num);
        String[] split = new String[4];
        for (int i = 0; i < 4; i++) {
            split[i] = number.substring(i, i + 1);
        }

        Arrays.sort(split);

        String num1 = split[0] + split[2];
        String num2 = split[1] + split[3];

        return Integer.parseInt(num1) + Integer.parseInt(num2);

    }


    public static void main(String[] args) {
        System.out.println(minimumSum(2932));
    }
}
