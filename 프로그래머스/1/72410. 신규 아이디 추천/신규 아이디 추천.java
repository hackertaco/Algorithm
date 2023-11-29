class Solution {
    public String solution(String new_id) {
        String answer = "";
        int length = new_id.length();
       
        answer = new_id.toLowerCase();
        answer = answer.replaceAll("[^a-z0-9\\-._]","");
        answer = answer.replaceAll("\\.{2,}", ".");
        
       
        StringBuilder sb = new StringBuilder(answer);
        if( sb.charAt(0) == '.'){
             sb.deleteCharAt(0);
        }
        if(sb.length() > 0 && sb.charAt(sb.length()-1) == '.'){
            sb.deleteCharAt(sb.length()-1);
        }
        
        if(sb.length() == 0){
             sb.append("a");
        }
        
        if(sb.length() >= 16){
            
            sb.delete(15, sb.length());
            if(sb.charAt(sb.length()-1) == '.'){
                sb.deleteCharAt(sb.length()-1);
            }
        }
        while(sb.length() > 0 &&sb.length()<=2){
            sb.append(sb.charAt(sb.length()-1));
        }
        
        return sb.toString();
        
        
        
    }
}