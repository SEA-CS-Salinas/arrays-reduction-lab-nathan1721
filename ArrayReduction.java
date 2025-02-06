import java.util.PriorityQueue;

public class ArrayReduction {
    public static int min_cost(int[] r) {
        if (r.length <= 1) {
            return 0; // If there's one or no element, no cost is needed
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int num : r) {
            pq.add(num);
        }

        int totalCost = 0;
        while (pq.size() > 1) {
            int first = pq.poll(); // Smallest
            int second = pq.poll(); // Second smallest
            int cost = first + second;
            totalCost += cost;
            pq.add(cost); // Push the sum back into the queue
        }

        return totalCost;
    }

    public static void main(String[] args) {
        int[][] testCases = {
            {212},
            {25, 10, 20},
            {1, 2, 3},
            {1, 2, 3, 4, 7, 22, 33, 54, -66, 3, 4, 5, 76, 7, 999},
            {1, 1, 1, 1, 1},
            {1, 1}
        };

        for (int[] testCase : testCases) {
            System.out.println(min_cost(testCase));
        }
    }
}
