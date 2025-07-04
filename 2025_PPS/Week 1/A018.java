import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class A018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 입력받을 배열의 길이
        int[] arrayA = new int[N];
        ArrayList<Integer> arrayB = new ArrayList<>();

        for(int i = 0; i < N; i++){ // A배열 입력
            arrayA[i] = sc.nextInt();
        }

        for(int i = 0; i < N; i++){ // B배열 입력하고 ArrayList에 넣음
            int b = sc.nextInt();
            arrayB.add(b);
        }

        Arrays.sort(arrayA); // A배열을 오름차순으로 정렬

        int sum = 0; // 인덱스별 곱한 값의 합

        for(int i = 0; i < N; i++){
            int max = Collections.max(arrayB); // B 배열 리스트에서 가장 큰 값을 구함
            sum += arrayA[i] * max; // 가장 큰 값과 A의 i번째 값을 곱한 후 sum에 더함
            arrayB.remove(Integer.valueOf(max)); // 가장 큰 값을 리스트에서 삭제
        }

        System.out.println(sum);

    }
}
