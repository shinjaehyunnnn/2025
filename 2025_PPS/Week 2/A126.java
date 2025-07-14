import java.util.Scanner;

/*
<백준 1065>
1부터 주어진 수까지의 한수 개수를 구하여라
주어진 수는 1000이하의 수이다.
 */
public class A126 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;

        if(num <= 99) // 99까지는 모두 한수임
            System.out.println(num);
        else {
            for(int i = 100 ; i <=num ; i++)
            {
                int n = i/100; // 백의 자리
                int m = (i/10) % 10; // 십의 자리
                int k = i % 10; // 일의 자리

                if((m-n) == (k-m)) // 백의자리와 십의자리 차이와 십의자리와 일의자리 차이가 같으면
                    count++;
            }
            System.out.println(count + 99);
        }
    }
}
