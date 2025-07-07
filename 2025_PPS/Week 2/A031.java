import java.util.Scanner;

/*
<백준 2163>
N x M 크기의 금이 가 있는 모양의 초콜릿을 1 x 1 크기의 초콜릿으로 쪼개는 최소한의 횟수를 구하는 프로그램을 작성

최소한의 횟수는 (N - 1) + N * (M - 1) = N - 1 + NM - N = NM - 1
 */
public class A031 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int count = N * M - 1;
        System.out.println(count);
    }
}
