import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i = 0; i<commands.length; i++){
            int[] arr = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            quickSort(arr, 0, arr.length-1);
            answer[i] = arr[commands[i][2]-1];
        }
        return answer;
    }
    public void quickSort(int[] arr, int start, int end){
        if (start >= end) return;
    
        int pivot = start;
        int lo = start + 1;
        int hi = end;
    
        while (lo <= hi) {
          while (lo <= end && arr[lo] <= arr[pivot]) // 피벗보다 큰 값을 만날 때까지
            lo++;
          while (hi > start && arr[hi] >= arr[pivot]) // 피벗보다 작은 값을 만날 때까지
            hi--;
            
          if (lo > hi) // 엇갈리면 피벗과 교체
            swap(arr, hi, pivot);
          else
            swap(arr, lo, hi);// 엇갈리지 않으면 lo, hi 값 교체 
          }
	
        quickSort(arr, start, hi - 1);
        quickSort(arr, hi + 1, end);

        }
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;        
    }

}