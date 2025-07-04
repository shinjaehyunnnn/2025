import java.util.Scanner;

public class A008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt(); // testCase의 개수를 입력받고
        double[] ratio = new double[testCase]; // testCase개수만큼 성적 비율을 저장할 배열 생성

        for(int i = 0; i < testCase; i++) { // testCase개수만큼 반복
            int student = sc.nextInt(); // Case별 학생 수 입력
            int[] score = new int[student]; // 해당 Case에서 학생의 점수를 저장할 배열
            int sum = 0; // 해당 Case의 학생 점수 총합
            int overAverageCount = 0; // 평균이 넘는 학생 수

            for(int j = 0; j < student; j++) { // 학생 수만큼 반복하여
                int scoreInput = sc.nextInt(); // 학생의 점수를 입력받고
                score[j] = scoreInput; // 학생점수를 배열에 저장하고
                sum += scoreInput; // 총합에 더함
            }

            for(int j = 0; j < student; j++) { // 학생 수만큼 반복하여
                if(score[j] > sum/student) { // 그 학생의 점수가 평균보다 높은경우
                    overAverageCount++; // Count를 증가
                }
            }

            ratio[i] = (double)overAverageCount/student * 100; // 평균이 넘는 학생 수 비율을 배열에 저장
        }

        for(int i = 0; i < testCase; i++) {
            System.out.printf("%.3f%%\n",ratio[i]); // 소수점 3자리까지 반올림하여 비율을 출력
        }
    }
}
