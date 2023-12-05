import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println(start());


    }
    public static long start(){
        Scanner sc = new Scanner(System.in);
        long N = sc.nextInt();
        long count = 0;
        Stack<Integer> list = new Stack<>();

        for(long i = 0; i < N; i++){
            list.push(sc.nextInt());
        }
        long curr;
        long max = Integer.MIN_VALUE;

        while(!list.isEmpty()){
            curr = list.peek();
            if(curr > max){
                count++;
                max = curr;
            }
            list.pop();
        }

        return count;
    }
}
