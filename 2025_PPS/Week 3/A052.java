import java.util.Scanner;

/*
<백준 8958>
"OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다.
문제를 맞은 경우 점수를 1점 더하고 만약 연속으로 정답을 맞춘 경우 2,3,4....점씩 더한다.
틀린 경우 연속으로 맞춘 횟수는 초기화 된다.
이때 OX퀴즈의 결과가 여러 개 주어졌을 때 점수를 구하는 프로그램을 작성하여라.
 */

public class A052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt(); // OX퀴즈 결과 개수
        sc.nextLine();
        int[] result = new int[count]; // 점수를 저장할 배열

        for(int i = 0 ; i < count ; i++){ // 결과 개수만큼 반복
            String answer = sc.nextLine(); // OX퀴즈 결과 입력

            int sum = 0; // OX퀴즈 점수
            int cumulative = 1; // 연속으로 맞춘 경우 더할 점수
            for(int j = 0 ; j < answer.length() ; j++){ // 문자열 길이 만큼 반복
                if(answer.charAt(j) == 'O') { // 정답일 경우
                    sum += cumulative; // 점수를 더하고
                    cumulative++; // 연속으로 맞춘 만큼 점수 증가
                } else if(answer.charAt(j) == 'X') { // 틀린 경우
                    cumulative = 1; // 연속으로 맞춘 횟수 초기화
                }
            }

            result[i] = sum;
        }

        for(int i = 0 ; i < result.length ; i++){
            System.out.println(result[i]);
        }
    }
}
