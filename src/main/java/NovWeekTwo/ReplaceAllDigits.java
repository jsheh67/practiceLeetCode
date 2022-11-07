package NovWeekTwo;

public class ReplaceAllDigits {
    public char shift(char c, int x){
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int index = alphabet.indexOf(c);
        return alphabet.charAt((index+x));

    }

    public String replaceDigits(String s) {
        StringBuilder b = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if(i%2!=0){
                b.append(shift(s.charAt(i-1),Integer.parseInt(s.substring(i,i+1))));
            }else{
                b.append(s.charAt(i));
            }
        }
        return b.toString();

    }
}
