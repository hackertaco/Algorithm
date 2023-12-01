class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int len = p.length();
        int start = 0;
        Long parsedP = Long.parseLong(p);
        StringBuilder sb = new StringBuilder(t);
        while(start + len <= t.length()){
            if(Long.parseLong(sb.substring(start, start+ len)) <= parsedP){
                answer++;
            }
            start++;
        }
        return answer;
    }
}