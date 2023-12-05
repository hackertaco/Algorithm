import java.util.*;
class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        int count = 0;
        char[] chars= s.toCharArray();
        
        for(char cha: chars){
            
            if(cha == '('){
                count ++;
            }else{
                count--;
            }
            
            if(count <= -1) return false;
        }
        if(count != 0) return false;
        return true;
    }
}