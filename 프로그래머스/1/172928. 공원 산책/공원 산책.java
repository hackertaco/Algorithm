import java.util.*;
class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = {};
        // 일단 routes를 split해서 map으로 만든다.
        // park를 배열의 배열로 바꾼다. 
        String[][] s = Arrays.stream(park).map(p -> p.split("")).toArray(String[][]::new);;
        int[] index = {0,0};
        // s의 인덱스를 찾는다.
        for(int i = 0; i < s.length; i++){
            for(int j = 0; j < s[0].length; j++){
                if(s[i][j].equals("S")){
                    index[0] = i;
                    index[1] = j;
                    
                }
            }
        }
       
        // routes를 돈다.
        int[] prevTemp = Arrays.copyOf(index, 2);
        int[] temp = Arrays.copyOf(index, 2);
        for(int i = 0 ; i < routes.length; i++){
            String[] route = routes[i].split(" ");
            Integer g = Integer.parseInt(route[1]);
            
            for(int j= 1; j <= g; j++){
                if(route[0].equals("E")){
                    temp[1] += 1;
                }
                if(route[0].equals("W")){
                    temp[1] -= 1;
                }
                if(route[0].equals("N")){
                    temp[0] -= 1;
                }
                if(route[0].equals("S")){
                    temp[0] += 1;
                }
                System.out.println(temp[0]);
                System.out.println(temp[1]);
                if(temp[0] < 0 || temp[0] >= s.length || temp[1] < 0 || temp[1] >= s[0].length || s[temp[0]][temp[1]].equals("X")){
                    temp = Arrays.copyOf(prevTemp,2);
                    break;
                }
            
            }
            prevTemp = Arrays.copyOf(temp,2);
        }
        index = temp;
        return index;
    }
}