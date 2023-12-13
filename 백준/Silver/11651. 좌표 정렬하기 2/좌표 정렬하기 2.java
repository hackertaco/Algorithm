
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt( bf.readLine());
        int[][] arr = new int[N][2];
        for(int i = 0; i < N; i++){
            int[] a = Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            arr[i] = a;
        }

        Arrays.sort(arr, ((o1, o2) -> {
            if(o1[1]-o2[1] == 0){
                return o1[0] - o2[0];
            }
            return o1[1] - o2[1];
        }));

        for(int[] a : arr){
            System.out.println(a[0] + " " + a[1]);
        }

    }
}
