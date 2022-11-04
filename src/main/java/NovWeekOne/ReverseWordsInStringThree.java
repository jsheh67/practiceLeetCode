package NovWeekOne;

public class ReverseWordsInStringThree {
    public static String reverseWords(String s) {
        String[] words = s.split("\s");
        StringBuilder b= new StringBuilder();
        for(String word: words){
            char[] w = word.toCharArray();
            int j= w.length-1;
            for(int i=0; i<w.length/2; i++){
                char temp = w[i];
                w[i]=w[j];
                w[j]=temp;
                j--;
            }
            b.append(String.valueOf(w));
            b.append(" ");
        }
        return b.substring(0,b.length()-1);
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
    }

}
