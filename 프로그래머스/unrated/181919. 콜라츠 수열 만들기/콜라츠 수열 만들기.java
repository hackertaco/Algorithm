import java.util.*;
class Solution {
    public int[] solution(int n) {
        int[] answer = new int[1000];
        int count = 0;
        while(n != 1){
            answer[count++] = n;
            if(n %2 != 1){
                n /= 2;
            }else{
                n = n*3 +1;
            }
        }
        answer[count++] = 1;
        return Arrays.copyOf(answer, count);
    }
}