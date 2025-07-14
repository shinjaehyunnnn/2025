import java.util.Scanner;

/*
<백준 10773>
처음 줄에 정수가 주어지고
다음 줄 부터 그 정수개수만큼의 수가 주어진다.

0이 주어지면 최근에 저장된 수가 지워진다. 최종적으로 저장되어있는 수의 합을 구한다
 */
public class A127 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] sum = new int[num]; // 0이 아닌 수를 저장할 배열
        int index = 0; // 합을 구할 범위값 index

        for(int i = 1; i <= num; i++) {
            int input = sc.nextInt();
            if(input != 0) // 0이 아닌경우 sum 배열에 저장함
                sum[index++] = input;
            else // 아닌 경우 index를 감소시킴
                index--;
        }

        int result = 0;
        for(int i = 0; i < index; i++) { // index까지만 반복해서 합을 구함
            result += sum[i];
        }

        System.out.println(result);
    }
}
