package DecWeek1;
//1974
public class MinTimeToTypeWord {
    public static int minTimeToType(String word) {
        char[] letters = word.toCharArray();
        int start =97;
        int time =0;

        for (char c: letters){
            int diff = Math.abs(start-c);
            System.out.println(diff);
            if(diff>13){
                diff=26-diff;
            }
            start=c;
            time = time+diff+1;
        }
        return time;
    }

    public static void main(String[] args) {
        System.out.println("--------------");
        System.out.println( "Time:"+minTimeToType("zjpc"));
        System.out.println("--------------");
    }

}
