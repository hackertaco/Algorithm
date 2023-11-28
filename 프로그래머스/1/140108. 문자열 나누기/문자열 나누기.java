import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        char currChar = s.charAt(0);
        int start = 0;
        int end = 0;
        
        for(int i = 0; i<s.length(); i++){
            if(start == end){
                answer++;
                currChar = s.charAt(i);
            }
            if(currChar == s.charAt(i)){
                start++;
            }else{
                end++;
            }
        }
        
        return answer;
    }
}