package Tree;

//Balanced Tree : difference btw height of left subtree and right tree is <= 1 for all nodes
public class BalancedTree {

    //Return true is difference btw height of left subtree and right tree is <= 1 for all nodes.
    public static boolean isBalancedNaive(Node root){
        if(root == null) return true;
        int lh = HeightOfBinaryTree.height(root.left);
        int rh = HeightOfBinaryTree.height(root.right);

        return (Math.abs(lh-rh) <=1 && isBalancedNaive(root.left) && isBalancedNaive(root.right));
    }

    //Returns height is balanced and returns -1 if tree is not balanced
    public static int isBalancedEff(Node root){
        if(root == null) return 0;
        int lh = isBalancedEff(root.left);
        if(lh == -1) return -1;
        int rh = isBalancedEff(root.right);
        if(rh == -1) return -1;

        if(Math.abs(lh - rh) > 1) return -1;
        return Math.max(lh,rh)+1;
    }
}
