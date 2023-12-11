import java.util.*;
class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Queue<Integer> priceQueue = new LinkedList<>();

        for (int price : prices) {
            priceQueue.add(price);
        }

        int idx = 0;
        while (priceQueue.peek() != null) {
            int value = priceQueue.poll();
            answer[idx] = 0;

            for (Integer integer : priceQueue) {
                answer[idx]++;
                if (value > integer) {
                    break;
                }
            }

            idx++;
        }

        return answer;
    }
}