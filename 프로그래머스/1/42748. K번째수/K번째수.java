import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        List<Integer> list = new ArrayList<>();
        
        for(int[] command: commands){
            int start = command[0];
            int end = command[1];
            System.out.println(array[end-1]);
            int[] sliced = Arrays.copyOfRange(array, start-1, end);
            Arrays.sort(sliced);
            list.add(sliced[command[2]-1]);
        }
        return list.stream().mapToInt(i->i).toArray();
    }
}