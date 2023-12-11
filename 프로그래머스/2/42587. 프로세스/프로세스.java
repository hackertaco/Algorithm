import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Integer> queue =  new LinkedList<>();
        for(int priority: priorities){
            queue.add(priority);
        }
        
        int[] copied = Arrays.copyOf(priorities, priorities.length);
        
        Arrays.sort(copied, Collections.reverseOrder());
        int curr = 0;
        int target = priorities[location];
        int idx = location;
        List<Boolean> flags = new ArrayList<>();
        Collections.fill(flags, false);
        flags.add(location, true);
        while(true){
            if(queue.poll() < copied[curr]){
                queue.offer(queue.remove());
                flags.put(flags.remove(0));
            }else if(queue.poll() == copied[curr]){
                answer++;
                curr++;
                queue.remove();
                if(flags.get(curr)){
                    break;
                }
                
            }
            
        }
        
        
        return answer;
    }
}