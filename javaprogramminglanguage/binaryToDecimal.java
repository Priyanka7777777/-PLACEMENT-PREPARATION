import java.util.*;

public class binaryToDecimal {
    public static void btd(int num) {
        int pow = 0;
        int dec = 0;
        int lastdigit = 0;
        int temp = num;
        while (temp > 0) {
            lastdigit = temp % 10;
            dec = dec + (lastdigit * (int) Math.pow(2, pow));
            pow++;
            temp = temp / 10;
        }
        System.out.println("Decimal of " + num + " is: " + dec);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        btd(number); // Corrected this line
    }
}
