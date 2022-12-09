package DecWeek1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//1379
public class CorrespondingNodeInClone {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }

    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        TreeNode currentNode=cloned;
        Queue<TreeNode> queue = new LinkedList<>();
        //ArrayList<Integer> results = new ArrayList<>();
        queue.add(currentNode);

        while(queue.size()>0){
            // if(currentNode.val==target.val){
            //     return currentNode;
            // }
            currentNode=queue.remove();
            if(currentNode.val==target.val){
                return currentNode;
            }
            //results.add(currentNode.val);
            if(currentNode.left != null){
                queue.add(currentNode.left);
            }
            if(currentNode.right != null){
                queue.add(currentNode.right);
            }
        }
        //System.out.println(results);
        return original;
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
        System.out.println();
        return results;
    }





}
