import java.util.*;
public class conditional2{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int number = sc.nextInt();
        switch(number){
            case 1:
            System.out.println("Sun");
                break;
            case 2:
            System.out.println("mon");
            break;
            case 3: 
            System.out.println("tuesday");
            break;
            case 4:
            System.out.println("wed");
            break;
            case 5:
            System.out.println("thru");
            break;
            case 6:
            System.out.println("fri");
            break;
            case 7:
            System.out.println("sat");
            break;
            default:
            System.out.println(" only 7 days there in week");
        }

    }
}