public class smallestEvenMultiple {
    public int smallestEvenMultiple(int n) {
        for(int i=2;i<150 ;i+=2){
            if(i%n==0){
                return i;
            }
        }
        return 0;
    }
}
