package Leetcode.amzTop50;

import java.util.PriorityQueue;

public class MinCostConnectSticks {
    public int connectSticks(int[] sticks) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int item: sticks)
            pq.add(item);

        int totalCost = 0;

        while(pq.size() > 1){
            int stick1 = pq.remove();
            int stick2 = pq.remove();

            totalCost += stick1 + stick2;

            pq.add(stick1+stick2);
        }

        return totalCost;
    }
}
