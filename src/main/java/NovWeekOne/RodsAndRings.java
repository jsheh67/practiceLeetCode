package NovWeekOne;

public class RodsAndRings {

    public static int countPoints(String rings) {
        String[] rods = new String[10];
        for(int i=0; i<10; i++){
            rods[i]="";
        }
        for(int i=0; i<rings.length()-1; i+=2){
            int index = Integer.parseInt(rings.substring(i+1,i+2));
            rods[index]=rods[index].concat(rings.substring(i,i+1));
        }
        int count=0;
        for(int i=0; i<10; i++){
            String s= rods[i];
            if(s.contains("R") && s.contains("G") && s.contains("B")){
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        System.out.println(countPoints("B0B6G0R6R0R6G9"));
    }
}
