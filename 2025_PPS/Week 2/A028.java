import java.util.Scanner;
import java.math.*;

/*
<백준 10757>
0 < A,B < 10^10000 범위의 A와 B를 입력받고 A+B의 값을 출력
 */

public class A028 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger A = new BigInteger(sc.next());
        BigInteger B = new BigInteger(sc.next());

        BigInteger sum = A.add(B);

        System.out.println(sum);
    }
}
