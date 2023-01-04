
import java.util.*;
class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    public TreeNode(int data) {
        this.data = data;
        left = null;
        right = null;
    }

}
public class post_inorder_to_tree {
    public static TreeNode createTree(int preStart, int preEnd, int inStart,int inEnd, int[]pre, int[]in, Map<Integer,Integer>map){
        if(preStart>preEnd || inStart>inEnd)
            return null;

        TreeNode root= new TreeNode(pre[preStart]);
        int inRoot=map.get(pre[preStart]);
        int n_elements=inRoot-inStart;
        root.left=createTree(preStart+1,preStart+n_elements,inStart,inRoot-1,pre,in,map);
        root.right=createTree(preStart+n_elements+1,preEnd,inRoot+1,inEnd,pre,in,map);

    return root;
    }




    public static TreeNode buildTree(int[]pre, int[]in){
        Map<Integer,Integer>map= new HashMap<>();
        for(int i=0;i<in.length;i++)
            map.put(in[i],i);
        int preStart=0;
        int preEnd=pre.length-1;
        int inStart=0;
        int inEnd=in.length-1;
        return createTree(preStart,preEnd,inStart,inEnd, pre,in,map);
    }

    static void print(TreeNode root){
        if(root==null)
            return;

        print(root.left);
        System.out.print(root.data+"-");
        print(root.right);

    }



    public static void main(String[]args){
        int preorder[] = {10,20,40,50,30,60};
        int inorder[] = {40,20,50,10,60,30};
        TreeNode root = buildTree(preorder, inorder);

        print(root);
    }
}