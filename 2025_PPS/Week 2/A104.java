import java.util.Arrays;
import java.util.Scanner;

/*
<백준 14487>
섬의 해안가를 따라 원형으로 마을들이 위치해있다.
임의의 A마을에서 임의의 B마을로 가기 위해서는 왼쪽 또른 오른쪽 도로를 통해 해안가를 따라 섬을 돌아야한다.
이 때 최소 비용으로 모든 마을을 방문하는 경우의 비용을 구하여라
 */

/*
임의의 마을 A와 B사이의 이동 비용이 가장 큰 경우, A와 B중 한 마을에서 출발을 시작한다고 가정하면
최소 비용을 구할 수 있다.
 */
public class A104 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); // 마을의 개수
        int[] cost = new int[num]; // 각 마을의 이동 비용
        for(int i = 0; i < num; i++){
            cost[i] = sc.nextInt();
        }

        int max = Arrays.stream(cost).max().getAsInt(); // 가장 이동 비용이 큰 마을 이동 경로
        int sum = 0; // 최소비용을 구하기 위한 이동 비용 합
        for(int i = 0; i < num; i++){ // 모든 이동 비용의 합
            sum += cost[i];
        }

        sum = sum - max; // 최소 비용 = 모든 이동 비용 합 - 가장 큰 이동 비용
        System.out.println(sum);
    }
}
