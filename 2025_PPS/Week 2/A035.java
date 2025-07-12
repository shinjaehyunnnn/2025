import java.util.*;

/*
<백준 5355>
@ 는 3을 곱하고, %는 5를 더하며, #은 7을 빼는 연산자이다.
따라서 식의 가장 앞에 수가 하나 있고 그 뒤로는 @,%,#의 연산자가 나온다.
첫 번째 입력에는 테스트 케이스 개수를 입력받고, 이 후 한 줄에 한 개의 식이 주어진다.
식의 결과를 계산하고 소수점 둘째 자리까지 출력한다.
 */
public class A035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); // 테스트 케이스 개수
        double[] answer = new double[num]; // 테스트 케이스 계산 결과를 저장할 배열

        for(int i = 0 ; i < num ; i++) {
            double temp = sc.nextDouble(); // 식의 첫 번째 입력 수
            String operator = sc.nextLine(); // 식에 사용될 연산자
            for(int j = 0 ; j < operator.length() ; j++) {
                if(operator.charAt(j) == '@') // @일 경우 *3
                    temp *= 3;
                else if(operator.charAt(j) == '%') // %일 경우 +5
                    temp += 5;
                else if(operator.charAt(j) == '#') // #일 경우 -7
                    temp -= 7;
            }

            answer[i] = temp;
        }

        for(int i = 0 ; i < answer.length ; i++) {
            System.out.printf("%.2f\n", answer[i]);
        }

    }
}
