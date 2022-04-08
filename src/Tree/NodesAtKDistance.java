package Tree;

public class NodesAtKDistance {

    public static void printNodesAtKDist(Node root, int k){
        if(root == null) return;
        if(k == 0){
            System.out.println(root.key);
        } else{
            printNodesAtKDist(root.left, k-1);
            printNodesAtKDist(root.right, k-1);
        }
    }
}
