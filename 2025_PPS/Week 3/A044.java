/*
<LeetCode 551>
학생의 출석기록을 문자로 기록한 문자열이 있다.
A는 결석, L은 지각, P는 출석을 의미한다.

출석상을 받는 조건은 다음과 같다.
조건 1. 결석 횟수가 2번 미만이여야 한다.
조건 2. 지각 횟수가 연속 3번 미만이여야 한다.

해당 학생이 출석상을 받을 수 있는지 없는지 판별하고 결과를 반환하는 함수를 작성하여라.
 */

public class A044 {
    public boolean checkRecord(String s) {
        int countA = 0;
        int countL = 0;

        for(int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') { // 해당일 학생이 결석한 경우
                countA++; // 결석 count 증가
                countL = 0; // 지각 count는 초기화
                if(countA >= 2) // 만약 2번 이상 결석하면 return false하고 종료
                    return false;
            } else if (s.charAt(i) == 'L') { // 해당일 학생이 지각한 경우
                countL++; // 지각 count 증가
                if(countL >= 3) // 지각을 연속 3번한 경우 return false하고 종료
                    return false;
            } else if (s.charAt(i) == 'P') { // 해당일 학생이 출석한 경우
                countL = 0; // 지각 count 초기화
            }
        }

        return true;
    }
}
