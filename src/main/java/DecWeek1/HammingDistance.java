package DecWeek1;

//461
public class HammingDistance {

    public static int hammingDistance(int x, int y) {
        String xbin = Integer.toBinaryString(x);
        String ybin = Integer.toBinaryString(y);

        int xLen= xbin.length();
        int yLen = ybin.length();

        int diff=xLen-yLen;

        StringBuilder xbi= new StringBuilder();
        StringBuilder ybi = new StringBuilder();
        if (diff>0){
            for(int i=0; i<diff; i++){
                ybi.append("0");
            }
            ybi.append(ybin);
            ybin = ybi.toString();
        }else if(diff<0){
            for(int i=0; i<(-1*diff); i++){
                xbi.append("0");
            }
            xbi.append(xbin);
            xbin= xbi.toString();
        }

        int dist=0;

//        System.out.println("x:"+xbin);
//        System.out.println("y:"+ybin);

        for(int i=0; i<xbin.length(); i++){
            if(xbin.charAt(i)!=ybin.charAt(i)){
                dist++;
            }
        }
        return dist;
    }

    public static void main(String[] args) {
        System.out.println(hammingDistance(1,4));
        System.out.println(hammingDistance(3,1));
    }


}
