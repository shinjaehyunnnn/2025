import java.util.Scanner;

/*
<백준 11022>
A+B의 결과를 출력하는 프로그램을 작성하여라.
 */

public class A194 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();

        String[] result = new String[testCase];
        for(int i = 0; i < testCase; i++){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int sum = A+B;
            result[i] = "Case #"+(i+1)+": "+ A + " + " + B +" = " + sum;

        }

        for(int i = 0; i < testCase; i++){
            System.out.println(result[i]);
        }
    }
}
