package DecWeek1;

public class NextGreaterElement {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        for(int i=0; i<res.length; i++){
            res[i]=-1;
        }

        for(int i=0; i<nums1.length; i++){
            for(int j=0; j<nums2.length; j++){
                if(nums1[i]==nums2[j]){
                    for(int k=j; k<nums2.length; k++){
                        if(nums2[k]>nums1[i]){
                            res[i] = nums2[k];
                            break;
                        }
                    }
                    break;
                }
            }

        }
        return res;
    }

    public static void main(String[] args) {

    }
}
