/*
<programmers - 나머지가 1이 되는 수 찾기>
자연수 n이 매개변수로 주어지면 n을 x로 나눈 나머지가 1이 되도록하는
가장 작은 자연수 x를 반환하는 함수를 작성하여라.
 */

public class A176 {
    public int solution(int n) {
        int answer = 0;

        for(int i = 1 ; i < n ; i++) { // 1부터 n-1까지 반복해서 나머지를 구함
            if(n % i == 1) { // 나머지가 1이면 그 수가 가장 작은 수
                answer = i;
                break;
            }
        }

        return answer;
    }
}
