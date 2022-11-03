import javax.imageio.stream.ImageInputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class UniqueMorseCodeWords {
    public static int uniqueMorseRepresentations(String[] words) {
        HashMap<String,String> morseCode= new HashMap<>();
        String[] morse={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String alphabet="abcdefghijklmnopqrstuvwxyz";
        for(int i=0; i<26; i++){
            morseCode.put(alphabet.substring(i,i+1), morse[i]);
        }

        //String[] morseList = new String[words.length];
        Set<String> morseSet = new HashSet<>();

        for(int i=0; i< words.length; i++){
            StringBuilder b=new StringBuilder();
            for(int j=0; j<words[i].length(); j++){
                b.append(morseCode.get(words[i].substring(j,j+1)));
            }
            morseSet.add(b.toString());
        }

        return morseSet.size();
    }

    public static void main(String[] args) {
        String[] words = {"gin","zen","gig","msg"};
        System.out.println(uniqueMorseRepresentations(words));
    }

}
