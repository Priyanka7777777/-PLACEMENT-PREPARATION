import java.util.*;
public class maximum{
    public static void maximumArray(ArrayList<Integer>list){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            if(max<list.get(i)){
                max =list.get(i);
            }
            
        }
        System.out.println("max element:"+max);
    }
    public static void main (String args[]){
        ArrayList<Integer>list=new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        maximumArray(list);
    }
}