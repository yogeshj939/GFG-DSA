package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

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
}
