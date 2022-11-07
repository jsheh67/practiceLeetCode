package NovWeekTwo;

public class ReverseInteger {

    public static int reverse(int x) {
        boolean negative=false;
        if(x<0){
            x=x*-1;
            negative=true;
        }

        int result=0;
        int size= (int) (Math.log10(x)+1);

        int j=size;
        for(int i=0; i<size; i++){
            int a= (int) (x/(Math.pow(10,i))%10);
            result+=(a*(Math.pow(10,j-1)));
            if(result>Integer.MAX_VALUE){
                return 0;
            }
            j--;
        }

        if(negative){
            result=result*-1;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
        System.out.println(reverse(123));


    }
}
