package DecWeek1;

import java.util.Arrays;

public class MinimumDeciBinary {
    public static int minPartitions(String n) {
        char max=0;
        for(int i=0; i<n.length(); i++){
            if(n.charAt(i)>max){
                max=n.charAt(i);
            }
        }
        return max-48;

    }
    public static int minPartitions2(String n) {
        char[] num = n.toCharArray();
        Arrays.sort(num);
        return num[num.length-1]-48;
    }

    public static void main(String[] args) {
        System.out.println(minPartitions("32"));
        System.out.println(minPartitions2("32"));

        System.out.println(minPartitions("82734"));
        System.out.println(minPartitions2("82734"));
    }
}
