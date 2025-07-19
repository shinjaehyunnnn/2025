import java.util.Scanner;

/*
<백준 2775>
a층의 b호에는 a-1층의 1호부터 b호까지의 사람들의 수의 합만큼의 사람이 살고있다.
테스트케이스 수가 주어지고 그 뒤 층수와 호수가 차례대로 입력되면 해당 호수에 살고있는 사람의 수를 출력하여라
 */
public class A032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] people = new int [15][15]; // 각 층 호수에 사는 사람의 수를 저장할 배열

        for(int i = 0 ; i < 15 ; i++){ // 0층 i호에는 i명의 사람이 살고있음
            people[0][i] = i;
        }

        for(int i = 1 ; i < 15 ; i++) { // 층수 만큼의 반복
            for(int j = 1 ; j < 15 ; j++) { // 호수만큼의 반복
                people[i][j] = people[i][j-1] + people[i-1][j]; // i층 j호에는 (i층 j-1호에 사는 사람 + i-1층 j호에 사는사람) 만큼의 사람이 살고있음
            }
        }

        int testCase = sc.nextInt(); // 테스트 케이스 수 입력

        StringBuilder result = new StringBuilder();

        for(int i = 0 ; i < testCase ; i++) {
            int floor = sc.nextInt(); // 층수 입력
            int room= sc.nextInt(); // 호수 입력
            result.append(people[floor][room] + "\n"); // 결과르리 result에 덧붙임
        }

        System.out.println(result);
    }
}
