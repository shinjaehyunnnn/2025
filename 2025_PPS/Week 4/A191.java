import java.util.Scanner;

/*
<백준 10950>
테스트케이스별로 A+B값을 출력하는 프로그램을 작성하여라.
 */

public class A191 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();

        int[] sum = new int[testCase];
        for(int i = 0; i < testCase; i++){
            int A = sc.nextInt();
            int B = sc.nextInt();
            sum[i] = A+B;
        }

        for(int i = 0; i < testCase; i++){
            System.out.println(sum[i]);
        }
    }
}
