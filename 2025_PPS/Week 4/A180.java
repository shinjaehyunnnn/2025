import java.util.Scanner;

/*
<백준 10430>
A, B, C가 주어졌을때 네가지 식을 구하는 프로그램을 작성하시오.
 */

public class A180 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        System.out.println( ( A + B ) % C);
        System.out.println( ( (A % C) + (B % C) ) % C);
        System.out.println( ( A * B ) % C);
        System.out.println( ( (A % C) * (B % C) ) % C);

    }
}
