import java.util.Scanner;

/*
<백준 1193>
무한히 큰 배열에 분수들이 적혀있다.
1/1 -> 1/2 -> 2/1 -> 3/1 -> 2/2 -> 1/3 -> 1/4 -> ... 와 같이 지그재그 순서로 1번, 2번,3번...이라 가정하자.
X가 주어졌을 때 X번째 분수를 구하는 프로그램을 작성하여라
 */

public class A105 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int count = 1; // 대각선 상의 분수 개수
        int count_sum = 0; // 지금까지의 분수 개수

        while(true) {
            if(num <= count_sum + count) { // 입력받은 값이 지금까지의 분수 개수 + 현재 대각선 상의 분수 개수보다 작은 경우
                if(count % 2 == 1) { // 대각선상의 분수 개수가 홀수이면 분자가 최대치서부터 감소
                    System.out.println((count - (num - count_sum) + 1) + "/" + (num - count_sum));
                    break;
                } else { // 대각선상의 분수 개수가 짝수이면 분모가 최대치서부터 감소
                    System.out.println((num - count_sum) + "/" + (count - (num - count_sum) + 1));
                    break;
                }
            } else { // 입력받은 값이 지금까지의 분수 개수 + 현재 대각선상의 분수 개수보다 크면
                count_sum += count; // 대각선 상의 분수 개수를 누적하고
                count++; // 대각선 상의 분수 개수는 1개 증가 ( 다음 대각선으로 이동 )
            }
        }
    }
}
