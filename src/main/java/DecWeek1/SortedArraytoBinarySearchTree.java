package DecWeek1;

public class SortedArraytoBinarySearchTree {

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

    public TreeNode sortedArrayToBST(int[] nums) {
        int middle = nums.length/2;
        TreeNode head = new TreeNode(nums[middle]);
        TreeNode temp = head;
        for(int i=0; i<nums.length; i++){
            if(i==middle){
                continue;
            }



        }
        return null;

    }



    public static void main(String[] args) {


    }
}
