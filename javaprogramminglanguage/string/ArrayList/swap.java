import java.util.*;
public class swap{
    public static void swapArray(ArrayList<Integer>list,int indx1,int indx2){
        int temp= list.get(indx1);
        //setting the value of index2 at index1 
        //temp=list(idx1)
        //list(idx1)=list(idx2)
        //list(idx2)=temp
        list.set(indx1,list.get(indx2));
        list.set(indx2,temp);


    }
    public static void main (String args[]){
        ArrayList<Integer>list=new ArrayList<>();
        int indx1=3; 
        int indx2 = 4;
        list.add(1);
        list.add(7);
        list.add(4);
        list.add(5);
        list.add(10);
        list.add(12);
        System.out.print("BEFORE SWAPPING:"+list);
        swapArray(list,indx1,indx2);
        System.out.println("");
        System.out.print("AFTER SWAPING:"+list);

    }
}