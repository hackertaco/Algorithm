import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) throws IOException {
        // N개의 정수 A[1], A[2], …, A[N]이 주어져 있을 때, 이 안에 X라는 정수가 존재하는지 알아내는 프로그램을 작성하시오.
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt( bf.readLine());
        int[] A = Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();


        int M = Integer.parseInt( bf.readLine());
        int[] B = Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        //ickSort(A, 0, N-1);
Arrays.sort(A);
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < M; i++) {
            if(binarySearch(A, B[i]) >= 0) {
                sb.append(1).append('\n');
            }
            else {
                sb.append(0).append('\n');
            }
        }
        System.out.println(sb);
    }
    public static int binarySearch(int[] arr, int key) {

        int lo = 0;
        int hi = arr.length - 1;

        while(lo <= hi) {
            int mid = (lo + hi) / 2;
            if(key < arr[mid]) {
                hi = mid - 1;
            } else if(key > arr[mid]) {
                lo = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
    public static void quickSort(int[] arr, int start, int end){
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