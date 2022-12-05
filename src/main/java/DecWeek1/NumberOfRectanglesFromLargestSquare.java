package DecWeek1;

//1725
public class NumberOfRectanglesFromLargestSquare {
    public int countGoodRectangles(int[][] rectangles) {
        int largest =0;
        int count=0;
        for(int[] rect: rectangles){
            int square = Math.min(rect[0],rect[1]);
            if(square>largest){
                largest=square;
                count=0;
            }
            if(square==largest){
                count++;
            }
        }
        return count;
    }

}
