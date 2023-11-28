import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] result = new int[26];
        String s = in.nextLine();

        // 배열 초기화를 반복문으로 처리하는 대신 Arrays.fill() 메서드 활용
        // Arrays.fill()을 사용하면 반복문 없이 배열을 특정 값으로 초기화할 수 있습니다.
        Arrays.fill(result, -1);

        // 문자열을 순회하면서 해당 문자의 위치를 기록
        for (int j = 0; j < s.length(); j++) {
            int index = s.charAt(j) - 'a';
            if (result[index] == -1) {
                result[index] = j;
            }
        }

        // 결과 출력
        for (int j : result) {
            System.out.print(j + " ");
        }
    }
}
