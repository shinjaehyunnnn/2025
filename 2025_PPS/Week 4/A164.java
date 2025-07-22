/*
<programmers - 가장 가까운 같은 글자>
문자열 s가 주어졌을 때, s의 각 위치마다 자신보다 앞에 나오면서 자신과 가장 가까운 곳에 있는 같은 글자가 어디있는지 판별하는 함수를 작성한다.
만약 문자 자신보다 앞에 같은 문자가 없는 경우 -1이다.
만약 문자 자신보다 앞에 같은 문자가 2칸 앞에 있으면 2이다.
이러면 결과가 저장되어있는 배열을 반환한다.
 */

public class A164 {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];

        for(int i = 0; i < s.length(); i++) { // 문자열 길이만큼 반복
            char temp = s.charAt(i); // i번째 문자를 저장

            int sameCharIndex = 0; // 앞에서 같은 문자가 있는 위치
            boolean found = false; // 같은 문자를 찾았는지 판별
            for(int j = 0 ; j < i ; j++) { // 문자 바로 앞까지 반복
                if(temp == s.charAt(j)) { // 만약 같은 문자가 있다면
                    sameCharIndex = j; // 문자의 위치를 최신화
                    found = true;
                }
            }

            if(found) // 같은 문자를 찾았으면
                answer[i] = i - sameCharIndex; // 두 문자 위치 차이는 i - 앞에서 찾은 문자 위치
            else
                answer[i] = -1; // 못찾았으면 -1

        }
        return answer;
    }
}
