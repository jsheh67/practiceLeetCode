package DecWeek1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
//938

public class RangeSumOfBst {
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

  public ArrayList<Integer> BFS(TreeNode root){
        TreeNode currentNode =root;
        Queue<TreeNode> queue = new LinkedList<>();
        ArrayList<Integer> results = new ArrayList<>();
        queue.add(currentNode);

        while (queue.size()>0){
            currentNode=queue.remove();
            results.add(currentNode.val);
            if(currentNode.left != null){
                queue.add(currentNode.left);
            }
            if(currentNode.right!=null){
                queue.add(currentNode.right);
            }
        }
        return results;
  }

  public int rangeSumBST(TreeNode root, int low, int high) {
        List<Integer> values = BFS(root);
        int sum =0;
        for(int val: values){
            if(val>=low && val<=high){
                sum += val;
            }
        }
        return sum;
    }



}
