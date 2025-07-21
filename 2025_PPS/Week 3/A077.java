import java.util.Arrays;
import java.util.Scanner;

/*
<백준 2822>
참가자는 총 8개의 문제를 풀고 참가자의 최종점수는 가장 높은 점수 5개의 합이다.
참가자의 최종 점수와 최종점수에 포함되는 문제번호를 오름차순으로 출력하는 프로그램을 작성하여라.
 */

public class A077 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] score = new int[8]; // 참가자의 8개 문제 점수

        for(int i = 0 ; i < 8 ; i++) {
            score[i] = sc.nextInt();
        }

        int[] index = new int[5]; // 최종 점수에 포함되는 문제 번호를 저장할 배열
        int sum = 0; // 참가자의 최종 점수

        for(int i = 0 ; i < 5 ; i++) { // 최종 점수 반영되는 5번 반복하여
            int maxIndex = 0;

            for(int j = 1 ; j < 8 ; j++) { // 가장 높은 점수 판별
                if(score[j] > score[maxIndex]) {
                    maxIndex = j;
                }
            }

            sum += score[maxIndex]; // 최종 점수에 높은 점수 추가
            index[i] = maxIndex+1; // 배열에 문제 번호 저장
            score[maxIndex] = 0; // 이미 반영된 문제의 점수는 0으로 초기화
        }

        System.out.println(sum);
        Arrays.sort(index);
        for(int i = 0 ; i < 5 ; i++) {
            System.out.print(index[i] + " ");
        }
    }
}
