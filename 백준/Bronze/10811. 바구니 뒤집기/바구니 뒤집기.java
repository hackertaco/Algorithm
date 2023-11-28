import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int basketCount = sc.nextInt();
        int sortCount = sc.nextInt();
        
        int[] basket = new int[basketCount+1];
        
        for(int i = 1; i<basket.length;i++){
            basket[i] = i;
        }
        
        for(int j = 0; j < sortCount; j++){
            int start = sc.nextInt();
            int end = sc.nextInt();
            
            for(int k = start; k<=end;k++){
                int swapNum = end--;
                int temp = basket[k];
                basket[k] = basket[swapNum];
                basket[swapNum] = temp;
            }
        }
        for(int p = 1; p <= basketCount; p++){
            System.out.print(basket[p] + " ");
        }
         
        
    }
}