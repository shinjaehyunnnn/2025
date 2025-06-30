import java.util.Scanner;

public class A015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;
        int sum = 0;

        for(int i = 0; i < 5; i++) { // 5회 반복하여 고유번호 5자리를 입력
            number = sc.nextInt();
            sum += number*number; // sum에 입력받은 고유번호 각 자리의 제곱을 더함
        }

        int result = sum % 10; // sum을 10으로 나눈 나머지값
        System.out.println(result);
    }
}

