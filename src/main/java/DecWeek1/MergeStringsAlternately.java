package DecWeek1;
//1768
public class MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        boolean word1shorter = word1.length()<word2.length();
        int maxLength=0;
        int minLength=0;
        if(word1shorter){
            minLength=word1.length();
            maxLength=word2.length();
        } else {
            minLength=word2.length();
            maxLength=word1.length();
        }

        StringBuilder b = new StringBuilder();
        int i=0;
        for(;i<maxLength; i++){
            if(i<minLength){
                b.append(word1.charAt(i));
                b.append(word2.charAt(i));
            }else{
                if(word1shorter){
                    b.append(word2.charAt(i));
                }else{
                    b.append(word1.charAt(i));
                }
            }
        }
        return b.toString();

    }
}
