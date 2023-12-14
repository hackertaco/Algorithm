
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt( bf.readLine());
        Set<Integer> set = new TreeSet<>();
        int[] arr = Arrays.stream(bf.readLine().split(" ")).mapToInt(i-> Integer.parseInt(i)).toArray();
        for(int i = 0; i < N; i++){
            set.add(arr[i]);
        }
        Iterator<Integer> iterator = set.iterator();
        StringBuilder sb = new StringBuilder();
        while(iterator.hasNext()){
            sb.append(iterator.next()).append(" ");
        }
        System.out.println(sb);
    }

}
