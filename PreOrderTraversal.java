
class TreeNode{
    int value;
    TreeNode left,right;
    TreeNode(int value){
        this.value=value;
        left=right=null;
    }
}
public class PreOrderTraversal{
    public void PreOrder(TreeNode root){
        if(root==null){
            return;
        }
        System.out.print(root.value+" ");
        PreOrder(root.left);
        PreOrder(root.right);
    }
    public static void main(String[] args){
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        PreOrderTraversal tree=new PreOrderTraversal();
        System.out.println("PreOrder Traversal: ");
        tree.PreOrder(root);
    }
}  