import java.util.*;
public class invertedHalfPyramid{
    public static void pattern(int row ){
   for(int i = 0;i<=row;i++){
    for(int j= 1;j<=row-i;j++){
       System.out.print(j);
    }
    System.out.println( );
    }
   
    }
    //inverted increasing number pattern->floyd's triangle
    public static void pattern1(int row){
        int counter =1;
        for(int i = 1; i<=row ;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(counter);
                counter++;
            }
            System.out.println();
        }

    }
    //0-1 triangle
    public static void pattern3(int row){
        for(int i =1;i<=row;i++){
            for(int j = 1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print('1');
                }
                else{
                    System.out.print('0');
            }
           
        }
        System.out.println( );
    }
    }
    //butterfly pattern
    //need correction
    
    public static void pattern5(int row){
    int no_ofline=1;
    int star=1;
   int  space = 2 * (row - no_ofline);
//outerloop
for(no_ofline = 1;no_ofline <=row; no_ofline++){
//star
for(int j= 1;j<=star;j++){
    System.out.print("*");
}
//space

for(int j= 1;j<=space;j++){
    System.out.println( );
}
//star
for(int j= 1;j<=star;j++){
    System.out.print("*");
}
System.out.println();
} 
if(no_ofline<row){
star++;
space=space-2;
}
else if (no_ofline>row){
star--;
space=space+2;
}
System.out.println();
    }
    public static void main (String args[]){
   Scanner sc = new Scanner(System.in);
   System.out.println("enter the number of row: ");
   int num = sc.nextInt();
pattern(num);
pattern1(num);
pattern3(num);

    }
}