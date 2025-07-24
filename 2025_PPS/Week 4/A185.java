import java.util.Scanner;

/*
<백준 1330>
A와 B가 입력되면 두 수를 비교하교 비교한 결과를 출력하는 프로그램을 작성하여라.
 */

public class A185 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        if(A > B)
            System.out.println(">");
        else if(A < B)
            System.out.println("<");
        else
            System.out.println("==");
    }
}
