package DecemberWeek2;

public class HouseRobber {
    public int rob(int[] nums) {
        int sum1=0;
        for(int i=0; i<nums.length; i+=2){
            sum1+=nums[i];
        }
        int sum2=0;
        for(int i=1; i<nums.length; i+=2){
            sum2+=nums[i];
        }
        if(sum1>sum2){
            return sum1;
        }
        else{
            return sum2;
        }


    }


}
