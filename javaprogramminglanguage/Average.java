import java.util.*;
public class Average{
    public static Float avg(Float a, Float b,Float c){
       
    Float Avg = a+b+c/3;
    return Avg;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

       Float a = sc.nextFloat();
       Float b = sc.nextFloat();
   Float  c = sc.nextFloat();
System.out.println(avg(a,b,c));

    }
}