package trees;
import java.util.*;

public class Tree {

    static void inorder(Node root) {
        if(root == null) return;
        inorder(root.left);
        System.out.println(root);
        inorder(root.right);
    }

    static void inorderIterative(Node root) {

        Stack<Node> s = new Stack<>();
        Node curr = root;

        while(curr != null || !s.isEmpty()){
            while(curr != null){
                s.push(curr);
                curr = curr.left;
            }
            curr = s.pop();
            System.out.println(curr);
            curr = curr.right;
        }
    }


    static void bfs(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            Node curr = q.poll();
            System.out.println(curr);
            if(curr.left != null) q.add(curr.left);
            if(curr.right != null) q.add(curr.right);
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(4);
        bfs(root);
    }
    
}


class Node {
     int val;
     Node left;
     Node right;

     Node(int val){
        this.val = val;
     }

     @Override
     public String toString(){
        return "Node (" + this.val + ")";
     }
}


