import java.util.HashSet;

public class IsPalindrome {
    public static boolean checkIfPangram(String sentence) {
        //String alphabet ="abcdefghijklmnopqrstuvwxyz";
        int len= sentence.length();

        HashSet set = new HashSet<>();
        for(int i=0; i<len; i++){
            set.add(sentence.charAt(i));
        }
        return(set.size()==26);
    }

    public static void main(String[] args) {
        System.out.println(checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
    }


}
