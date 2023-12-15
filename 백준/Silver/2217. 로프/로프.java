import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt( bf.readLine());
        int[] ropes = new int[N];

        for(int i = 0; i<N; i++){
            ropes[i] = Integer.parseInt( bf.readLine());
        }
        Arrays.sort(ropes);
        int max = 0;
        int count = 1;
        for(int i = N-1; i>= 0; i--){
            max = Math.max(ropes[i] * count, max);
            count++;
        }
        System.out.println(max);
    }


}