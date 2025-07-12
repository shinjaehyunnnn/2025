import java.util.Scanner;

/*
<백준 2953>
다섯 참가자들이 서로 다른 사람의 음식을 점수로 평가해준다.
점수는 1점부터 5점까지이고 가장 많은 점수를 얻은 사람이 우승한다.
우승자가 유일한 경우만 고려한다.
 */
public class A033 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] sum = new int[5]; // 각 참가자의 점수 합을 저장할 배열

        for(int i = 0 ; i < 5 ; i++) { // 각 참가자 점수 합을 구하기 위한 반복
            for(int j = 0 ; j < 4 ; j++) { // 다른 참가자가 평가한 점수 입력 및 합
                int score = sc.nextInt();
                sum[i] += score;
            }
        }

        int winnerIndex = 0;
        for(int i = 1 ; i < 5 ; i++) { // 가장 점수가 높은 참가자의 인덱스 구하기
            if(sum[i] > sum[winnerIndex]) {
                winnerIndex = i;
            }
        }

        System.out.println(winnerIndex + 1 + " " + sum[winnerIndex]);
    }
}
