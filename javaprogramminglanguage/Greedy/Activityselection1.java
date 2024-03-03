import java.util.*;
public class Activityselection1{
    public static void main (String args[]){
        int start []={ 0,1,3,5,5,8};
        int end[]={6,2,4,7,9,9};
        int activities [][]=new int [start.length][3];
        for(int i = 0;i<start.length;i++){
            activities[i][0]=i;
            activities[i][1]=start[i];
            activities[i][2]=end[i];

        }
        //lamda function->short form
        Arrays.sort(activities,Comparator.comparingDouble(o->o[2]));
        int maxactivity = 0;
        ArrayList<Integer>ans = new ArrayList<>();
        //1st activity
        maxactivity =1;
        ans.add(activities[0][0]);
        int lastEnd = activities[0][2];
        for(int i = 0;i<ans.size();i++){
            if(activities[i][1]>=lastEnd){
                //activity select
                maxactivity++;
                ans.add(activities[i][0]);
                lastEnd=activities[i][2];
            }
        
        System.out.println("max Activities="+maxactivity);

    }
    for(int i = 0;i<ans.size();i++){
        System.out.println("A"+ans.get(i)+" ");
    }
    System.out.println();
}
}