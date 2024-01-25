import java.util.*;
public class swapnumbers{

    public static void main(String args[]){
int x=3 ;
int y=4;
System.out.println("before swap x="+x+ " "+ "before swap y="+ y );
x=x^y;
y=x^y;
x=x^y;
System.out.println("after swap x="+ x+" "+ "after swap y ="+ y);
    }
}