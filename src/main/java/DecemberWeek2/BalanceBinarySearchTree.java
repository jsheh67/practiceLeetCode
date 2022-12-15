package DecemberWeek2;

import com.sun.source.tree.Tree;

import java.util.*;

public class BalanceBinarySearchTree {
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
        TreeNode currentNode=root;
        Queue<TreeNode> queue = new LinkedList<>();
        ArrayList<Integer> results = new ArrayList<>();
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

    public boolean insert(int val, TreeNode root){
        TreeNode newNode = new TreeNode(val);
        if(root==null){
            root= newNode;
            return true;
        }
        TreeNode temp = root;
        while(true){
            if(newNode.val== temp.val){return false;}
            if(newNode.val> temp.val){
                if(temp.right==null) {
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }else{
                if(temp.left==null){
                    temp.left=newNode;
                    return true;
                }
                temp = temp.left;
            }
        }
    }



  public TreeNode balanceBST(TreeNode root) {
        List<Integer> nodes=BFS(root);
        nodes.sort(Comparator.comparingInt(a -> a));
        int size = nodes.size();

        //middle val node as head
        TreeNode head = new TreeNode(nodes.get(size/2));
        TreeNode rootH = head;
        nodes.remove(size/2);

        for(Integer i: nodes){
            insert(i, head);
        }

        return rootH;

    }
}
