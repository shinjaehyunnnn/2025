import java.util.Arrays;
import java.util.Scanner;

/*
<백준 2693>
테스트케이스 횟수와 그 횟수만큼 크기가 10인 배열이 주어지면
해당 배열에서 3번 째로 큰 수를 출력하는 프로그램을 작성하여라.
 */

public class A081 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt(); // 테스트 케이스 횟수
        int[] arr = new int[10]; // 크기 10 배열을 저장
        int[] result = new int[count]; // 3번 째로 큰 수 들을 저장할 배열

        for(int i = 0 ; i < count ; i++) { // 테스트 케이스 횟수만큼
            for(int j = 0 ; j < 10 ; j++) { // 배열 길이 만큼
                arr[j] = sc.nextInt();
            }

            Arrays.sort(arr); // 오름차순 정렬
            result[i] = arr[7]; // 3번째로 큰 수는 결과 저장 배열에
        }

        for(int i = 0 ; i < count ; i++) {
            System.out.println(result[i]);
        }
    }
}
