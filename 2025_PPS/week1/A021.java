import java.util.Scanner;

public class A021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int available = 1; // 사용 가능한 컴퓨터 개수
        int amount = sc.nextInt(); // 멀티탭의 개수

        for(int i = 0; i < amount; i++){
            int add = sc.nextInt(); // 추가한 멀티탭을 플러그 개수
            available += add - 1; // 사용 가능한 컴퓨터 개수 += 멀티탬 플러그 개수 - 멀티탭을 꽃을 플러그 1개
        }

        System.out.println(available);

    }
}
