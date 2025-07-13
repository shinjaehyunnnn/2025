import java.util.Scanner;

/*
<백준 1292>
122333444455555... 와 같은 수열을 만들고 일정 구간에 대한 구간합을 구한다.
예를 들어 3 7이면 3번째 자리부터 7째자리까지의 합을 구한다.
 */

public class A107 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();

        int count = 0;
        int sum = 0;

        for(int i = 1 ; i <= end ; i++)
            for(int j = 1 ; j <= i ; j++) {
                count++;

                if(start <= count && count <= end)
                    sum += i;
            }

        System.out.println(sum);
    }
}
