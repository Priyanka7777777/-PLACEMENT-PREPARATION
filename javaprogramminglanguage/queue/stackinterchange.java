import java.util.*;

public class stackinterchange {
    public static void interverse(Queue<Integer> q) {
        int size = q.size();
        Queue<Integer> updatedQueue = new LinkedList<>();
        Queue<Integer> firstHalf = new LinkedList<>();

        // Extract the first half of the queue
        for (int i = 0; i < size / 2; i++) {
            firstHalf.add(q.remove());
        }

        // Reverse the second half using a stack
        Stack<Integer> stack = new Stack<>();
        while (!q.isEmpty()) {
            stack.push(q.remove());
        }
        while (!stack.isEmpty()) {
            updatedQueue.add(stack.pop());
        }

        // Interleave the elements back into the original queue
        while (!firstHalf.isEmpty() || !updatedQueue.isEmpty()) {
            if (!firstHalf.isEmpty()) {
                q.add(firstHalf.remove());
            }
            if (!updatedQueue.isEmpty()) {
                q.add(updatedQueue.remove());
            }
        }
    }

    public static void main(String args[]) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        interverse(q);

        while (!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }
        System.out.println();
    }
}
