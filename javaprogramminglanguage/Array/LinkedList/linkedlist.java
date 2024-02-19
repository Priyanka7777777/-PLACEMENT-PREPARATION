import java.util.*;
public class linkedlist{
    //creation of Node class
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        
        }
    }
    
    public static Node head;
    public static Node tail;
    public static void Addfirst(int data){
        //creation of new node
        Node newNode = new Node(data);
        if(head==null){
            head= tail = newNode;
            return;
        }
        //newnode.next = head
        newNode.next = head;//-->link

        //head= newnode
        head = newNode;

    }
    public static void Addlast(int data){
       Node newNode = new Node(data);
       if(head== null){
        head =tail= newNode;
       } 
       tail.next = newNode;
       tail = newNode;
    }
     public static void PrintAdd(){
        if(head ==null){
System.out.println("Linkedlist is empty");
return;
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"--> ");
            temp = temp.next;

        }
        System.out.println("null");
        
     }
    
    public static void main (String args[]){
        linkedlist l1 = new linkedlist();
        l1.PrintAdd();
        l1.Addfirst(2);
        l1.PrintAdd();
        l1.Addfirst(1);
        l1.PrintAdd();
        l1.Addlast(3);
        l1.PrintAdd();
        l1.Addlast(4);
        l1.PrintAdd();
        l1.Addlast(5);
        l1.Addlast(6);
        l1.PrintAdd();


    }
}
