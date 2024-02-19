import java.util.*;
public class reverse{
    public static void reverArray(ArrayList<Integer>list){
        for(int i = list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+ " ");
            
        }
        System.out.print(" ");
    }


    public static void main (String args[]){
        ArrayList<Integer>list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        reverArray(list);

    }
}