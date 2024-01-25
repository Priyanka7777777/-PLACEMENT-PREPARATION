import java.util.*;
public class getithbit{
    public static int ithbit(int i, int n){
int bitmask = 1<<i;
    if((n&bitmask)==0){
    return 0;
}
return 1;
    }
    
    public static void main(String args[]){
     System.out.println("4th bit in number 9 is:"+(ithbit(3,9)));
    }
}