import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class decodeMessage {
    public static String decodeMessage(String key, String message) {
        key = key.replace("\s","");
        ArrayList keyList = new ArrayList<>();

        for(int i=0; i<key.length(); i++){
            if(!keyList.contains(key.charAt(i))){
                keyList.add(key.charAt(i));
            }
        }

        //System.out.println(keyList);

        HashMap map = new HashMap<>();
        String alphabet="abcdefghijklmnopqrstuvwxyz";
        for(int i=0; i< keyList.size(); i++){
            char c= (char) keyList.get(i);
            map.put(c,alphabet.charAt(i));
        }
        //map.put("\s","\s");
        StringBuilder builder = new StringBuilder();
        for(int j=0; j<message.length(); j++){
            if(message.charAt(j)==' '){
                builder.append("\s");
            }else {
                builder.append(map.get(message.charAt(j)));
            }
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        System.out.println(decodeMessage("the quick brown fox jumps over the lazy dog","vkbs bs t suepuv" ));
        System.out.println(decodeMessage( "eljuxhpwnyrdgtqkviszcfmabo","zwx hnfx lqantp mnoeius ycgk vcnjrdb" ));

    }
}
