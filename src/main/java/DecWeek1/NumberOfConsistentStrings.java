package DecWeek1;
//1684
public class NumberOfConsistentStrings {

    public static int countConsistentStrings(String allowed, String[] words) {
        int bad=0;
        for(String s : words){
            if(s.matches(".*[^"+allowed+"].*")){
                bad++;
            }
        }
        return words.length-bad;
    }

    public static void main(String[] args) {
        String allowed="ab";
        String[] words={"ad","bd","aaab","baa","badab"};

        System.out.println(countConsistentStrings(allowed,words));

    }
}
