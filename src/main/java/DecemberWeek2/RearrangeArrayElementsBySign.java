package DecemberWeek2;

public class RearrangeArrayElementsBySign {
    public int[] rearrangeArray(int[] nums) {
        int len =nums.length;
        int[] pos = new int[len/2];
        int[] neg = new int[len/2];

        int pI=0;
        int nI=0;

        for(int i=0; i<len;i++){
            if(nums[i]<0){
                neg[nI]=nums[i];
                nI++;
            }
            else{
                pos[pI]=nums[i];
                pI++;
            }
        }

        for(int i=0; i<len ; i++){
            nums[i]=pos[i/2];
            nums[i+1]=neg[i/2];
            i++;
        }

        return nums;

    }

}
