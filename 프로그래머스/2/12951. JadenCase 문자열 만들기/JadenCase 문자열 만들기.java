import java.util.*;
class Solution {
    public String solution(String s) {
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder(s.toLowerCase());
        char prev = sb.charAt(0);
        for(int i = 0; i < sb.length(); i++){
            if(i == 0 || (prev == ' ' && sb.charAt(i) != ' ')){
                if(sb.charAt(i) > 96 && sb.charAt(i)< 123){
                    sb.setCharAt(i, Character.toUpperCase(s.charAt(i)));
                }
            }
            prev = sb.charAt(i);
        }
        
        return sb.toString();
    }
}