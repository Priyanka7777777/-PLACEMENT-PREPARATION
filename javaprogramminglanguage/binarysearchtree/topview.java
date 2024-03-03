import java.util.*;
public class topview{
    static class Node{
        int data;
        Node left, right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    } 
    static class Info{
        Node node;
        int hd;
        public Info(Node node,int hd){
            this.node = node;
            this.hd = hd;
        }
    }
    public static void TopView(Node root){
        // Level order traversal
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer,Node> map = new HashMap<>();
        int min = 0;
        int max = 0;
        //adding rootnode
        q.add(new Info (root,0));
        q.add(null);
        while(!q.isEmpty()){
            Info curr = q.remove();
            if(curr == null){
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                //check for horizontal distance for the current node
                if(!map.containsKey(curr.hd)){// first time my hd is occuring
                    map.put(curr.hd,curr.node);
                }
                if(curr.node.left!=null){
                    q.add(new Info(curr.node.left,curr.hd-1));
                 min = Math.min(min,curr.hd-1);
                }

if(curr.node.right!= null){
    q.add(new Info(curr.node.right,curr.hd+1));
    max = Math.max(max,curr.hd+1);
}
            }
                
            }
            for(int i = min;i<= max ;i++){
                System.out.print(map.get(i).data+" ");
            }
            System.out.println();
        }
    
    
    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.left.left = new Node (5);
        root.right.left = new Node(6);
    TopView(root);
    }
}