import java.util.*;
class Solution {
    public int[] solution(int[] prices) {
        int[] answer = {};
        Stack<Integer> time = new Stack<>();
        Stack<Integer> count = new Stack<>();
        
        time.push(prices.length-1);
        
        for(int i = 1; i < prices.length; i++){
            if(prices[i] >= prices[i-1]){
                time.push(prices.length - 1 - i);
            }else{
                int prev = i - 1;
                while(prev > -1 && prices[i] < prices[prev] && time.peek() > 1){
                    count.push(time.pop()-1);
                    prev--;
                }
                while(!count.isEmpty()){
                    time.push(count.pop());
                }
                time.push(prices.length - 1 - i);
            }
        }
        return time.stream().mapToInt(i->i).toArray();
    }
}