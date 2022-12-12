package DecemberWeek2;
//1389
import java.util.Arrays;

public class TargetArray {

    public static int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        for(int i=0; i<target.length; i++){
            target[i]=-1;
        }

        for(int i=0; i<index.length; i++){

            if(target[index[i]]!=-1){
                for(int j=index.length-1; j>=index[i]; j--){
                    target[j]=target[j-1];
                }
            }
            target[index[i]]=nums[i];
        }
        return target;
    }

    public static void main(String[] args) {
        int[] nums ={0,1,2,3,4};
        int[] index ={0,1,2,2,1};

        System.out.println(Arrays.toString(createTargetArray(nums,index)));

    }
}
