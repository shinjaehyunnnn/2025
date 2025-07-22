import java.util.Scanner;

/*
<백준 8393>
주어진 정수까지의 숫자 합을 구하고 출력하는 프로그램을 작성하여라.
 */
public class A192 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int sum = 0;

        for(int i = 1 ; i <= input ; i++) {
            sum += i;
        }

        System.out.println(sum);
    }
}
