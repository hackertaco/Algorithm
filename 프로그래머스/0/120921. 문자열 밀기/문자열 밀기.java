class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        String cp = A;
        for(int i = 0; i < A.length(); i++){
            if(cp.equals(B)) return answer;
            String temp = cp.substring(A.length() -1);
            cp = temp + cp.substring(0, A.length() -1);
            answer ++;
        }
        return -1;
    }
}