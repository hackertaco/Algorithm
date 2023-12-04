import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        Stack<Integer> stack = new Stack<>();
        for(int a: arr){
            if(stack.size() == 0){
                stack.push(a);
                continue;
            }
            if(!stack.peek().equals(a)){
                stack.push(a);
            }
        }
        return stack.stream().mapToInt(i->i).toArray();
    }
}