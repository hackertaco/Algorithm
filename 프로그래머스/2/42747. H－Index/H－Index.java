import java.util.*;
class Solution {
    public int solution(int[] citations) {
        int h = 0;
        Arrays.sort(citations);
        for(int i = 0; i<citations.length; i++){
            if(citations.length - i == 
               Math.min(citations.length - i, citations[i])){
                h = Math.max(h, citations.length - i);
            }
        }
        
        return h;
    }
}