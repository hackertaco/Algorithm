import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        Stack<Integer> stack = new Stack<>();
        int[] durations = new int[progresses.length];
        for(int i = 0; i < progresses.length; i++){
            int duration = (100-progresses[i]) / speeds[i];
            if((100-progresses[i]) % speeds[i] > 0) duration++;
            durations[i] = duration;
        }
        int prev = 0;
        int curr = 0;
        while(curr < durations.length){
            if(durations[prev] < durations[curr]){
                stack.push(curr-prev);
                prev = curr;
                curr++;
            }else if(durations[prev] >= durations[curr]){
                curr++;
            }
            
        }
        if(prev < curr){
            stack.push(curr-prev);
        }
        return stack.stream().mapToInt(i->i).toArray();
    }
}