class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int currMax = 0;
        int currMin = 0;
        
        for(int[] size: sizes){
            currMax = Math.max(currMax, Math.max(size[0], size[1]));
            currMin = Math.max(currMin, Math.min(size[0], size[1]));
        }
        return currMax * currMin;
    }
}