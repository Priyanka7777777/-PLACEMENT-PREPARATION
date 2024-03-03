import java.util.*;
public class activitySelection{
    public static void main(String args[]){
        int start[]={1,6,0,7,4,5};
        int end[]={2,4,6,7,9,9};
        //end time basis sorted
        int maxactivity = 0;
        ArrayList<Integer>ans = new ArrayList<>();
        //1st activity
        maxactivity = 1;
        ans.add(0);
        int lastEnd = end[0];
        for(int i = 0;i<end.length;i++){
            if(start[i]>=lastEnd){
                maxactivity++;
                ans.add(i);
                lastEnd = end[i];
            
        }
        System.out.println("max Activities="+maxactivity);

    }
    for(int i = 0;i<ans.size();i++){
        System.out.println("A"+ans.get(i)+" ");
    }
    System.out.println();
}
}