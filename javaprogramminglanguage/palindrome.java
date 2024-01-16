import java.util.*;

public class palindrome {
    public static boolean isPalindrome(int num) {
        int original = num;
        int reverse = 0;
        
        while (num != 0) {
            int rem = num % 10;
            reverse = reverse * 10 + rem;
            num = num / 10;
        }
        
        return original == reverse;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.println("Is palindrome? " + isPalindrome(number));
    }
}
