import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        int[] copy = Arrays.copyOf(priorities, priorities.length);
        Arrays.sort(copy);
        Stack<Integer> stack = new Stack<>();
        
        for(int c: copy){
            stack.push(c);
        }
        int pointer =0;
        while(true){
            if(stack.peek() == priorities[pointer]){
                if(pointer == location){
                    break;
                }else{
                    answer++;
                    stack.pop();
                    pointer = movePointer(pointer, priorities.length-1);
                }
            }else{
                pointer = movePointer(pointer, priorities.length-1);
            }
        }
        
        
        
        return answer+1;
    }
    public int movePointer(int pointer, int length){
        if(pointer == length){
            return 0;
        }else{
            return ++pointer;
        }
    }
}