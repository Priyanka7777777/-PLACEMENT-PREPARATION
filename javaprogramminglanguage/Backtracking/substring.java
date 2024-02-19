import java.util.*;
public class substring{
    public static void findPermutation(String str,String ans){
        //base case
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        //recursion
        for(int i= 0;i<str.length();i++){
            char curr = str.charAt(i);
            //abcde= "ab"+"de"="abde"
            //getting exclusive i and starting from i+1 exclude i from the scope
            String newstr= str.substring(0,i)+str.substring(i+1);//if no last index given in substring it automatically 
            //take n-1 as last value as substring(i+1)==> substring(i+1,n-1)
            findPermutation(newstr,ans+curr);

        }
    }

    public static void main (String args[]){
        String str = "abc";
        findPermutation(str," ");
    }
}




