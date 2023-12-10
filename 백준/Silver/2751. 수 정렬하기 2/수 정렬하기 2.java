import java.util.*;
import java.io.*;

public class Main {
    private static int[] arr;
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(bf.readLine());
        arr = new int[length];
        
        for(int i=0; i<arr.length;i++) {
			arr[i] = Integer.parseInt(bf.readLine());
		}
        
        doMergeSort(0,arr.length-1);
        printArr();
    }
    public static void doMergeSort(int left, int right) {
		
		if(left < right) {
			int center = (left + right)/2;
			
			doMergeSort(left,center);
			doMergeSort(center+1,right);
			
			applyMergeSort(left,right);
			
		}
	}
	
	public static void applyMergeSort(int left, int right) {
		
		int[] leftArr = new int[right - left +1];
		int center = (left+right)/2;
		int leftArrSize = 0;
		
		int arrPointer = left;
		int rightPointer = center+1;
		int leftPointer = 0;
		
		for(int i=left; i<=center;i++) {
			leftArr[leftArrSize++] = arr[i];
		}
		
		for(arrPointer = left; arrPointer <= right; arrPointer++) {
			if(leftPointer < leftArrSize && rightPointer <= right) {
				arr[arrPointer] = leftArr[leftPointer] < arr[rightPointer] ? leftArr[leftPointer++] : arr[rightPointer++];
			}else {
				break;
			}
		}
		
		while(leftPointer < leftArrSize) {
			arr[arrPointer++] = leftArr[leftPointer++];
		}
	}
    public static void printArr() throws IOException {
		StringBuilder sb = new StringBuilder();
		for(int value : arr) {
			sb.append(value).append("\n");
		}
		System.out.println(sb.toString());
	}
}