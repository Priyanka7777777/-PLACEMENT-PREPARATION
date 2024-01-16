import java.util.*;

public class RangePrime {
    public static boolean isPrime(int num) {
        boolean isprime=true;
        if (num < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
    public static void prime(int n){
        for(int i = 2;i<=n;i++){
            if(isPrime(i)){
            System.out.println(i);
        }
    }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = sc.nextInt();

        prime(number);
    }
}
