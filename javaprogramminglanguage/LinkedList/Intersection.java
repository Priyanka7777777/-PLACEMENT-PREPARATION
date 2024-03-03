import java.util.*;
public class Intersection{
   static class Node{
    int data;
    Node next;
    Node(int val){
        data = val;
        next = null;
    }
   } 
   public static boolean getIntersectionNode(Node head1,Node head2){
    Node temp1= head1;
    Node temp2 = head2;
    while(temp1!= null){
        while(temp2!= null){
            if(temp1==temp2){
                return true;
            }
            temp2 = temp2.next;
        }
        temp2 = head2;
        temp1=temp1.next;
    }
    return false;
   }
   public static void main(String args[]){
    Node head1= new Node(4);//4
    Node newNode = new Node(5);
    head1.next = newNode;//4->5
    newNode = new Node(6);
    head1.next.next= newNode;//4->5->6
    newNode = new Node(7);
    head1.next.next.next=newNode;//4->5->6->7
    Node head2=new Node(1);//1
    newNode= new Node(2);
    head2.next = newNode; //1->2
    newNode = new Node(3);
    head2.next.next = newNode;//1->2->3
    newNode = new Node(6);
    head2.next.next.next= head1.next.next;//newNode;1->2->3->6,created intersection
    newNode = new Node(7);
    head2.next.next.next.next= newNode;//1->2->3->6->
boolean mergingPoint = getIntersectionNode(head1,head2);
if(mergingPoint ==true){
    System.out.print("They are mergining");
}
else{
    System.out.print("They are not merging");
}
   }
}