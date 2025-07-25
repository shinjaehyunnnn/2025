/*
<programmers - 크기가 작은 부분문자열>
숫자로 이루어진 문자열 t와 p가 주어질 때, t에서 p와 길이가 같은 부분문자열 중에서,
이 부분문자열이 나타내는 수가 p가 나타내는 수보다 작거나 같은 것이 나오는 횟수를 return하는 함수 solution을 완성하세요.

예를 들어, t="3141592"이고 p="271" 인 경우, t의 길이가 3인 부분 문자열은 314, 141, 415, 159, 592입니다.
이 문자열이 나타내는 수 중 271보다 작거나 같은 수는 141, 159 2개 입니다.
 */

public class A166 {
    public int solution(String t, String p) {
        int answer = 0; // 부분 문자열을 만족하는 개수
        int tLen = t.length(); // t문자열 길이
        int pLen = p.length(); // p문자열 길이

        for(int i = 0 ; i <= tLen - pLen ; i++) { // 부분 문자열을 구할 수 있는 개수만큼 반복
            String temp = t.substring(i, i + pLen); // t에서 부분 문자열을 구함

            if(temp.compareTo(p) <= 0) { // p와 비교해서 t의 부분 문자열이 p 이하이면
                answer++;
            }
        }

        return answer;
    }
}
