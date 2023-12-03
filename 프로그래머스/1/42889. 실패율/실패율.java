import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        List<Integer> answer = new ArrayList<>();
        Map<Integer, Double> map = new HashMap<>();
        int count = 0;
        int startIdx = 0;
        
        Arrays.sort(stages);
        int prev = stages[0];
        
        for(int i = 0; i < stages.length; i++){
            int curr = stages[i];
            if(curr == prev){
                count++;
            }else{
                map.put(prev, ((double)count / (double)(stages.length - (startIdx))));
                startIdx = i;
                count = 1;
            }
            
            prev = curr;
            if(i == stages.length -1 && stages[i] <= N){
                map.put(prev, ((double)count / (double)(stages.length - (startIdx))));
            }
        }
        
        for(int i = 1; i < N+1; i++){
            if(map.get(i) == null){
                map.put(i, 0.0);
            }
        }
        
        
        List<Map.Entry<Integer, Double>> entryList = new LinkedList<>(map.entrySet());
        entryList.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        
        
        for(Map.Entry<Integer, Double> list: entryList){
            answer.add(list.getKey());
        }
        
        return answer.stream().mapToInt(i->i).toArray();
    }
}