public class CenterOfStarGraph {
    public static int findCenter(int[][] edges) {
        int totalLength = edges[0].length*2;
        int[] flat = new int[totalLength];

        int index=0;
        for(int i=0; i<totalLength/2; i++){
            flat[index++]=edges[i][0];
            flat[index++]=edges[i][1];
        }

        int count1 =0;
        for(int i=0; i<totalLength;i++){
            if(flat[i]==edges[0][0]){
                count1++;
            }
        }

        if(count1==totalLength/2){
            return edges[0][0];
        }

        return edges[0][1];
    }

    public static void main(String[] args) {
        int[][] test = {{1,3},{2,3}};
        System.out.println(findCenter(test));
    }
}
