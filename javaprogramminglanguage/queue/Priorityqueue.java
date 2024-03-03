import java.util.*;

public class Ropes {
    public static int connectRopes(int arr[]) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }
        int profit = 0;
        while (pq.size() > 1) {
            int p1 = pq.poll();
            int p2 = pq.poll();
            int p = p1 + p2;
            profit = profit + p;
            pq.add(p);
        }
        return profit;
    }

    public static void main(String args[]) {
        int arr[] = {4, 3, 2, 6};
        int ans1 = connectRopes(arr);
        System.out.println(ans1);
    }
}
