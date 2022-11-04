package NovWeekOne;

public class StrictlyPalindromicNumber {
    public static boolean isStrictlyPalindromic(int n) {
        for(int i=2; i<=n-2; i++){
            String binary =  Integer.toString(n,i); //converts to base2
            for(int j=0; j<binary.length()/2; j++){
                if(binary.charAt(j)!=binary.charAt(binary.length()-1)-j){
                    return false;
                }
            }
        }
        return true;

    }

    public static void main(String[] args) {
        System.out.println(isStrictlyPalindromic(9));
    }
}
