package NovWeekOne;

public class ReverseVowels {
    public static String reverseVowels(String s) {
        StringBuilder vow= new StringBuilder();
        for(int i=s.length()-1; i>=0; i--){
            String str= s.substring(i,i+1);
            if(str.matches("[aAeEiIoOuU]")){
                vow.append(str);
            }
        }
        StringBuilder word = new StringBuilder();
        int v=0;
        for(int i=0; i<s.length(); i++){
            if(s.substring(i,i+1).matches("[aAeEiIoOuU]")){
                word.append(vow.charAt(v));
                v++;
            }else{
                word.append(s.charAt(i));
            }
        }

        return word.toString();

    }

    public static void main(String[] args) {
        System.out.println(reverseVowels("leetcode"));
    }

}
