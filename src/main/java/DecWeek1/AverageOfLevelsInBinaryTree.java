package DecWeek1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.logging.Level;

public class AverageOfLevelsInBinaryTree{

    public static class TreeNode {
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
    public static ArrayList<Integer> BFS(TreeNode root){
        TreeNode currentNode=root;
        Queue<TreeNode> queue = new LinkedList<>();

       // int x=0;


        ArrayList<Integer> results = new ArrayList<>();

        ArrayList<Integer> level = new ArrayList<>();
        ArrayList<Boolean> marked = new ArrayList<>();

        queue.add(currentNode);

        while(queue.size()>0){

            currentNode=queue.remove();
            results.add(currentNode.val);
            if(currentNode.left != null){
                queue.add(currentNode.left);
            }
            if(currentNode.right != null){
                queue.add(currentNode.right);
            }
        }
        return results;
    }


  public List<Double> averageOfLevels(TreeNode root) {
       return null;



  }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);


        BFS(root);

    }




}
