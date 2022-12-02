package DecWeek1;
//1704
public class StringHalvesAlike {

    public static boolean halvesAreAlike(String s) {
        String front = s.substring(0, s.length()/2);
        String back =s.substring(s.length()/2);

        int fcount=0;
        int bcount=0;

        for(int i=1; i<=front.length(); i++){
            if(front.substring(i-1,i).matches("[aeiouAEIOU]")){
                fcount++;
            }
            if(back.substring(i-1,i).matches("[aeiouAEIOU]")){
                bcount++;
            }
        }
        return(fcount==bcount);
    }

    public static void main(String[] args) {
        String test = "book";
        String test2 = "textbook";
        System.out.println(halvesAreAlike(test));
        System.out.println(halvesAreAlike(test2));
    }

}
