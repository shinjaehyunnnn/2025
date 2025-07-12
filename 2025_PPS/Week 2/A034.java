import java.util.Scanner;

/*
<백준 3052>
수 10개를 입력 받고 이를 42로 나눈 나머지를 구한다.
이 10개의 나머지 중 서로 다른 값이 몇 개 있는지 출력한다.
 */

public class A034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10]; // 입력받은 값을 저장할 배열
        int count = 0; // 중복 값 개수를 구할 변수

        for(int i = 0; i < 10; i++) {
            num[i] = sc.nextInt(); // 값 입력
            int temp = num[i]%42; // 42로 나눈 나머지 값을 temp에 저장
            boolean duplicate = false;

            for(int j = 0; j < i; j++) { // 입력 받은 인덱스 직전까지 반복
                if(temp == num[j]%42) { // 나머지 중복 발생의 경우
                    duplicate = true;
                    break;
                }

            }
            if(!duplicate) // 위 중복 판별에서 true가 아니였다면 서로 다른 값
                count++;
        }

        System.out.println(count);
    }
}
