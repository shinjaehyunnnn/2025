import java.util.Scanner;

/*
<백준 11653>
주어진 값을 소인수분해하는 프로그램을 작성하여라
 */
public class A124 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for(int i = 2 ; i <= num ; i++) {
            while(num % i == 0) {
                System.out.println(i);
                num /= i;
            }
        }

        if(num != 1) {
            System.out.println(num);
        }
    }
}
