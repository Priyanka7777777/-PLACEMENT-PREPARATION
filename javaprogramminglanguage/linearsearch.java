import java.util.*;

public class linearsearch {
    public static int search(String[] name, String key) {
        for (int i = 0; i < name.length; i++) {
            if (name[i].equals(key)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String key = sc.nextLine();
        String[] name = {"samosa", "dosa", "kheer"};

        int index = search(name, key);
        if (index == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Key is at index: " + index);
        }
    }
}
