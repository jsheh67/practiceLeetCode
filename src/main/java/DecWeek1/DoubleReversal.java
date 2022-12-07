package DecWeek1;

//2119
public class DoubleReversal {
    public boolean isSameAfterReversals(int num) {
        if(num==0){
            return true;
        }
        return num%10!=0;
    }

}
