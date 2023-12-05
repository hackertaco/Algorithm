import java.util.*;
class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        int[] arr = {a,b,c};
        Arrays.sort(arr);
        if(arr[0] < arr[1]){
            if(arr[1] < arr[2]){
                return arr[0] + arr[1] + arr[2];    
            }else{
                return (arr[0] + arr[1] + arr[2] )* (arr[0]*arr[0] + arr[1] *arr[1] + arr[2]*arr[2]); 
            }
            
        }else{
            if(arr[1] < arr[2]){
                return (arr[0] + arr[1] + arr[2] )* (arr[0]*arr[0] + arr[1] *arr[1] + arr[2]*arr[2]);    
            }else{
                return (arr[0] + arr[1] + arr[2] )* (arr[0]*arr[0] + arr[1] *arr[1] + arr[2]*arr[2]) * (arr[0]*arr[0]*arr[0] + arr[1] *arr[1]*arr[1] + arr[2]*arr[2]*arr[2]) ; 
            }
            
        }
        
    }
}