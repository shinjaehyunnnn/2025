import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/*
<백준 1427>
주어진 수를 내림차순으로 정렬하는 프로그램을 작성하여라.
 */

public class A066 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int len = input.length();
        Integer[] arr = new Integer[len]; // 입력값을 저장할 배열

        for(int i = 0 ; i < len ; i++) { // 배열에 입력값 저장
            arr[i] = Integer.parseInt(input.substring(i, i + 1));
        }

        Arrays.sort(arr, Collections.reverseOrder()); // 내림차순으로 정렬하여 배열에 저장

        for(int i = 0 ; i < len ; i++) { // 순서대로 출력
            System.out.print(arr[i]);
        }
    }
}
