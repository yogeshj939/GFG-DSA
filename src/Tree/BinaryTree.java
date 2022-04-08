package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

    private static int maxLevel = 0;

    public static int findSize(Node root){
        if(root == null) return 0;
        return findSize(root.left) + findSize(root.right) + 1;
    }

    public static int findMax(Node root){
        if(root == null) return Integer.MIN_VALUE;
        return Math.max(root.key, Math.max(
                findMax(root.left), findMax(root.right)
        ));
    }

    public int height(Node root){
        if(root == null){
            return 0;
        }
        return Math.max(height(root.left), height(root.right))+1;
    }

    public static void printNodesAtKDist(Node root, int k){
        if(root == null) return;
        if(k == 0){
            System.out.println(root.key);
        } else{
            printNodesAtKDist(root.left, k-1);
            printNodesAtKDist(root.right, k-1);
        }
    }

    public static void levelOrderTraversal(Node root){
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);

        while(queue.isEmpty()){
            Node ele = queue.poll();
            System.out.println(ele.key);
            if(ele.left != null){
                queue.add(ele.left);
            }
            if(ele.right != null){
                queue.add(ele.right);
            }
        }
    }

    public static void levelOrderTraversalNewLine1(Node root){

        if(root == null) return;

        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        queue.add(null);

        while (queue.size() > 1){
            Node ele = queue.poll();

            if(ele == null){
                System.out.println();
                queue.add(null);
                continue;
            }

            System.out.print(ele.key +" ");

            if(ele.left != null) queue.add(ele.left);
            if(ele.right != null) queue.add(ele.right);
        }
    }

    public static void levelOrderTraversalNewLine2(Node root){

        if(root == null) return;

        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);

        while (!queue.isEmpty()){
            int count = queue.size();
            for(int i = 0; i < count; i++){
                Node curr = queue.poll();
                System.out.print(curr.key+" ");
                if(curr.left != null) queue.add(curr.left);
                if(curr.right != null) queue.add(curr.right);
            }
            System.out.println();
        }
    }

    public static void printLeftViewRecursive(Node root, int level){
        if(root == null) return;
        if(maxLevel < level){
            System.out.println(root.key);
            maxLevel = level;
        }
        printLeftViewRecursive(root.left, level+1);
        printLeftViewRecursive(root.right, level+1);
    }

    public static void printLeftViewIterative(Node root){
        if(root == null) return;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int count = queue.size();
            for(int i = 0; i < count; i++){
                Node curr = queue.poll();
                if(i == 0)
                    System.out.println(curr.key);
                if(curr.left != null) queue.add(curr.left);
                if(curr.right != null) queue.add(curr.right);
            }
        }
    }

}
