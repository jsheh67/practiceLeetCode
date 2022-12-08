package DecWeek1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//872
public class LeafSimilarTrees {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) {
            this.val = val;}
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

        ArrayList<Integer> leaves = new ArrayList<>();

        queue.add(currentNode);

        while(queue.size()>0){
            if(currentNode.left==null && currentNode.right==null){
                leaves.add(currentNode.val);
            }

            currentNode=queue.remove();
            results.add(currentNode.val);
            if(currentNode.left != null){
                queue.add(currentNode.left);
            }
            if(currentNode.right != null){
                queue.add(currentNode.right);
            }
        }
        return leaves;
        //return results;
    }

    public ArrayList<Integer> DFSInOrder(TreeNode root){
        ArrayList<Integer> results = new ArrayList<>();
        class Traverse{
            Traverse(TreeNode currentNode){
                if(currentNode.left!=null){
                    new Traverse(currentNode.left);
                }
                results.add(currentNode.val);
                if(currentNode.right!=null){
                    new Traverse(currentNode.right);
                }

            }
        }
        new Traverse(root);
        return results;

    }

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> tree1Leaves = BFS(root1);
        List<Integer> tree2Leaves = BFS(root2);

        return (tree2Leaves.equals(tree1Leaves));

    }


}
